/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.OrderDAO;
import swd.dto.AccountDTO;
import swd.dto.OrderDTO;

/**
 *
 * @author dohuy
 */
@WebServlet(name = "SearchOrderController", urlPatterns = {"/SearchOrderController"})
public class SearchOrderController extends HttpServlet {

    private static final String ORDER_LIST = "orderList.jsp";
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
            String search = request.getParameter("txtSearch");
            if (search == null) {
                search = "";
            }
            OrderDAO orderDAO = new OrderDAO();
            Date from = null, to = null;
            if (!request.getParameter("dateFrom").isEmpty() || !request.getParameter("dateTo").isEmpty()) {
                if (!request.getParameter("dateFrom").isEmpty() && !request.getParameter("dateTo").isEmpty()) {
                    from = Date.valueOf(request.getParameter("dateFrom"));
                    to = Date.valueOf(request.getParameter("dateTo"));
                } else if (!request.getParameter("dateFrom").isEmpty()) {
                    from = Date.valueOf(request.getParameter("dateFrom"));
                    to = Date.valueOf(LocalDate.now());
                } else {
                    to = Date.valueOf(request.getParameter("dateTo"));
                    from = Date.valueOf(LocalDate.now());
                }
                if (from.after(to)) {
                    Date temp = from;
                    from = to;
                    to = temp;
                }
            }
            String status = request.getParameter("cbStatus");
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null) {
                if (loginUser.getRole().equals("admin")) {

                    url = ORDER_LIST;
                    
                    orderDAO.searchOrder(search, from, to, status);
                    List<OrderDTO> listOrder = orderDAO.ListOrder();
                    session.setAttribute("ORDER_LIST", listOrder);
                } else {
                    url = ERROR;
                    request.setAttribute("ERROR", "You do not have permission to do this");
                }
            }
        } catch (Exception e) {
            log("ERROR at SearchOrderController: " + e.getMessage());
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
