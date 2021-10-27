/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.OrderDAO;
import swd.dao.OrderDetailDAO;
import swd.dao.PaymentDetailDAO;
import swd.dao.ProductDAO;
import swd.dto.AccountDTO;
import swd.dto.OrderDetailDTO;
import swd.dto.ProductDTO;

/**
 *
 * @author Admin
 */
public class ReviewProductController extends HttpServlet {

    private static final String REVIEW = "review.jsp";
    private static final String ERROR = "error.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            PaymentDetailDAO paymentDAO = new PaymentDetailDAO();
            OrderDAO orderDAO = new OrderDAO();
            OrderDetailDAO detailDAO = new OrderDetailDAO();
            ProductDAO productDAO = new ProductDAO();
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null) {
                if (loginUser.getRole().equals("customer")) {
                    String orderID = request.getParameter("orderID");
                    List<OrderDetailDTO> listOrderDetail = (List) session.getAttribute("HISTORYDETAIL");
                    if(listOrderDetail.size() > 0) {
                        List<ProductDTO> listProduct = new ArrayList<>();
                        for (OrderDetailDTO orderDetailDTO : listOrderDetail) {
                            ProductDTO dtoProduct = productDAO.getProductByPrimaryKey(orderDetailDTO.getProductID());
                            listProduct.add(dtoProduct);
                        }
                        if(listProduct.size() > 0) {
                            url = REVIEW;
                            session.setAttribute("PRODUCTLISTREVIEW", listProduct);
                            session.setAttribute("TEMPORDER", orderID);
                        }
                    }
                }
            } else {
                url = ERROR;
                request.setAttribute("ERROR", "You do not have permission to do this");
            }
        } catch (Exception e) {
            log("ERROR at ReviewProductController: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
