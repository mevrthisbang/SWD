/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import swd.dto.AccountDTO;
import swd.dto.OrderDTO;
import swd.dto.OrderDetailDTO;

/**
 *
 * @author Admin
 */
public class ShoppingHistoryController extends HttpServlet {

    private static final String ORDER_HISTORY = "historyOrder.jsp";
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
        String idCus = null;

        try {
            OrderDAO orderDAO = new OrderDAO();
            OrderDetailDAO detailDAO = new OrderDetailDAO();
            String statusInput = request.getParameter("cbStatus");
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null) {
                if (loginUser.getRole().equals("customer")) {
                    url = ORDER_HISTORY;
                    idCus = loginUser.getId();
                    orderDAO.getListOrderOfUserByStatus(idCus, statusInput);
                    List<OrderDTO> listOrderOfCustomer = orderDAO.ListOrderOfUser();
                    if (!listOrderOfCustomer.isEmpty()) {
                        Map<OrderDTO, List<OrderDetailDTO>> order = new HashMap<>();
                        for (OrderDTO orderDTO : listOrderOfCustomer) {
                            detailDAO.getItem(orderDTO.getOrderID());
                            List<OrderDetailDTO> listOrderDetail = new ArrayList<>();
                            listOrderDetail = detailDAO.ListItemInOrder();
                            if (!listOrderDetail.isEmpty()) {
                                order.put(orderDTO, listOrderDetail);
                            }
                        }
                        session.setAttribute("ORDERHISTORY", order);
                    }
                } else {
                    url = ERROR;
                    request.setAttribute("ERROR", "You do not have permission to do this");
                }
            }
        } catch (Exception e) {
            log("ERROR at ShoppingHistoryController: " + e.getMessage());
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
