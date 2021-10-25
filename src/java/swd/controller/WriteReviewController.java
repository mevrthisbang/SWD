/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.ReviewDAO;
import swd.dto.AccountDTO;
import swd.dto.ReviewDTO;

/**
 *
 * @author Admin
 */
public class WriteReviewController extends HttpServlet {

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
        String idCus;
        try {
            String orderID = request.getParameter("orderID");
            String productID = request.getParameter("productID");
            String reviewContent = request.getParameter("txtComment");
            String reviewRate = request.getParameter("rate");
            ReviewDAO daoReview = new ReviewDAO();
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            String status = "Submitted";
            if (loginUser != null) {
                if (loginUser.getRole().equals("customer")) {
                    idCus = loginUser.getId();
                    String reviewID;
                    String lastID = daoReview.getLastReviewID();
                    if (lastID == null) {
                        reviewID = "R-1";
                    } else {
                        String currentNum = lastID.substring(1);
                        int num = Integer.parseInt(currentNum);
                        num = num + 1;
                        reviewID = "R-" + num;
                    }
                    ReviewDTO dtoReview = new ReviewDTO(reviewID, idCus, productID, orderID, reviewContent, status, Float.parseFloat(reviewRate));
                    boolean result = daoReview.createReview(dtoReview);
                    if (result) {
                        url = ORDER_HISTORY;
                    }
                }
            } else {
                url = ERROR;
                request.setAttribute("ERROR", "You do not have permission to do this");
            }
        } catch (Exception e) {
            log("ERROR at WriteReviewController: " + e.getMessage());
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
