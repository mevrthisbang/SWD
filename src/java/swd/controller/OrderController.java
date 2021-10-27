/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.OrderDAO;
import swd.dao.ProductDAO;
import swd.dto.AccountDTO;
import swd.dto.OrderDTO;
import swd.dto.PaymentDetailDTO;
import swd.dto.ProductDTO;
import swd.object.CartObj;
import swd.object.OrderErrorObject;
import swd.paypal.PaypalPaymentServices;

/**
 *
 * @author mevrthisbang
 */
public class OrderController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String INVALID = "cart.jsp";
    private static final String SUCCESS = "SearchController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null && loginUser.getRole().equals("customer")) {
                String paymentMethod = request.getParameter("paymentMethod");

                CartObj cart = (CartObj) session.getAttribute("CART");
                //Check loi quantity
                boolean check = true;
                for (ProductDTO product : cart.getCart().values()) {
                    ProductDAO productDAO = new ProductDAO();
                    int quantityInStock = productDAO.getQuantityByProductID(product.getProductID());
                    if (quantityInStock - product.getQuantity() < 0) {
                        check = false;
                        product.setDescription("Quantity in stock: " + quantityInStock);
                    }
                }
                if (paymentMethod.equals("PayPal")) {
                    if (check) {
                        PaypalPaymentServices paymentServices = new PaypalPaymentServices();
                        String approvalLink = paymentServices.authorizePayment(cart);
                        response.sendRedirect(approvalLink);
                    } else {
                        session.setAttribute("CART", cart);
                        request.getRequestDispatcher(INVALID).forward(request, response);
                    }

                } else {
                    String fullname = request.getParameter("txtFullname");
                    String phone = request.getParameter("txtPhone");
                    String address = request.getParameter("txtAddress");
                    OrderErrorObject errorObj = new OrderErrorObject();
                    if (fullname.isEmpty()) {
                        check = false;
                        errorObj.setFullnameError("Not supposed to be empty");
                    }
                    if (phone.isEmpty()) {
                        check = false;
                        errorObj.setPhoneError("Not supposed to be empty");
                    }
                    if (!phone.matches("[0-9]{10}")) {
                        check = false;
                        errorObj.setPhoneError("Phone number must be 10 number");
                    }
                    if (address.isEmpty()) {
                        check = false;
                        errorObj.setAddressError("Not supposed to be empty");
                    }
                    if (check) {
                        OrderDAO dao = new OrderDAO();
                        String lastOrderIDByCustomer = dao.getLastOrderIDByCustomer(loginUser.getId());
                        String orderID;

                        if (lastOrderIDByCustomer != null) {
                            int count = Integer.parseInt(lastOrderIDByCustomer.split("_")[2]);
                            orderID = "OD_" + loginUser.getId() + "_" + (count + 1);
                        } else {
                            orderID = "OD_" + loginUser.getId() + "_1";
                        }
                        OrderDTO order = new OrderDTO(orderID, loginUser.getId(), fullname, phone, address);
                        order.setTotal(cart.getTotal());
                        order.setStatus("Wait for Confirmation");
                        PaymentDetailDTO paymentDetail = new PaymentDetailDTO(orderID + "P-1", "P-1", orderID, null, "Pending");
                        if (dao.insertOrder(order, cart.getCart(), paymentDetail)) {
                            //Cap nhat quantity
                            url = SUCCESS;
                            request.setAttribute("SUCCESS", "Order Successfully!");
                            session.removeAttribute("CART");
                        }
                    } else {
                        url = INVALID;
                        request.setAttribute("INVALID", errorObj);
                        session.setAttribute("CART", cart);
                    }
                    request.getRequestDispatcher(url).forward(request, response);
                }
            }else{
                request.setAttribute("ERROR", "You do not have permission to do this.");
                request.getRequestDispatcher(url).forward(request, response);
            }

        } catch (Exception e) {
            log("ERROR at OrderController: " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
