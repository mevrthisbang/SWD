package swd.controller;

import swd.dao.OrderDAO;
import swd.dao.OrderDetailDAO;
import swd.dao.PaymentDetailDAO;
import swd.dao.ProductDAO;
import swd.dto.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowOrderDetailController extends HttpServlet {
    private static final String ORDER_DETAIL = "orderDetail.jsp";
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
            OrderDetailDAO detailDAO = new OrderDetailDAO();
            OrderDAO orderDAO = new OrderDAO();

            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null) {
                if (loginUser.getRole().equals("admin")) {
                    url = ORDER_DETAIL;
                    String orderID = request.getParameter("orderID");

                    if (orderID != null) {
                        detailDAO.getItem(orderID);
                        List<OrderDetailDTO> listOrderDetail = new ArrayList<>();
                        listOrderDetail = detailDAO.ListItemInOrder();
                        if (listOrderDetail.size() > 0) {
                            ProductDAO dao = new ProductDAO();
                            List<ProductDTO> list = dao.getAllProduct();
                            PaymentDetailDTO dtoPaymentDetail = paymentDAO.getPaymentDetailByOrder(orderID);
                            OrderDTO dtoOrder = orderDAO.getOrderByID(orderID);
                            if (list.size() > 0) {
                                request.setAttribute("listProductToShow", list);
                                session.setAttribute("ITEM_LIST", listOrderDetail);
                                session.setAttribute("PAYMENT_DETAIL", dtoPaymentDetail);
                                session.setAttribute("ORDER_DETAIL", dtoOrder);
                            }
                        }
                    }
                } else {
                    url = ERROR;
                    request.setAttribute("ERROR", "You do not have permission to do this");
                }
            }
        } catch (Exception e) {
            log("ERROR at ShowOrderDetailController: " + e.getMessage());
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
