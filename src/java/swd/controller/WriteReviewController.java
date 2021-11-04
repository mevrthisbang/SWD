/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.ReviewDAO;
import swd.dto.AccountDTO;
import swd.dto.ProductDTO;
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
            String reviewContent = null;
            String reviewRate = null;
            HttpSession session = request.getSession();
            ReviewDAO daoReview = new ReviewDAO();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null) {
                if (loginUser.getRole().equals("customer")) {
                    List<ProductDTO> listProduct = (List) session.getAttribute("PRODUCTLISTREVIEW");
                    Map<String, String> mapCR = null;
                    Map<String, Map> mapItem = new HashMap<>();
                    for (ProductDTO productDTO : listProduct) {
                        mapCR = new HashMap<>();
                        reviewContent = request.getParameter("txtComment" + productDTO.getProductID());
                        reviewRate = request.getParameter("rate" + productDTO.getProductID());
                        mapCR.put(reviewContent, reviewRate);
                        mapItem.put(productDTO.getProductID(), mapCR);
                    }
                    if (mapItem.size() > 0) {
                        if (mapCR.size() > 0) {
                            for (String string : mapItem.keySet()) {
                                for (ProductDTO productDTO : listProduct) {
                                    if (productDTO.getProductID().equals(string)) {
                                        Map<String, String> value = mapItem.get(string);
                                        String inputComment = "";
                                        String inputRate = "";
                                        for (String String : value.keySet()) {
                                            inputComment = String;
                                            inputRate = value.get(String);
                                        }
                                        if(inputRate == null) {
                                            inputRate = "5";
                                        }
                                        String status = "Submitted";
                                        String orderID = (String) session.getAttribute("TEMPORDER");
                                        idCus = loginUser.getId();
                                        String reviewID;
                                        String lastID = daoReview.getLastReviewID();
                                        if (lastID == null) {
                                            reviewID = "R-1";
                                        } else {
                                            String currentNum = lastID.substring(2);
                                            int num = Integer.parseInt(currentNum);
                                            num = num + 1;
                                            reviewID = "R-" + num;
                                        }
                                        ReviewDTO dtoReview = new ReviewDTO(reviewID, idCus, productDTO.getProductID(), orderID, inputComment, status, Float.parseFloat(inputRate));
                                        boolean result = daoReview.createReview(dtoReview);
                                        if (result) {
                                            url = ORDER_HISTORY;
                                            request.setAttribute("AFTERREVIEW", "true");
                                        }
                                    }
                                }
                            }
                        }
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
