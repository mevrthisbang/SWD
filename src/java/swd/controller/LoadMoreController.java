/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import swd.dao.ProductDAO;
import swd.dto.ProductDTO;

/**
 *
 * @author mevrthisbang
 */
public class LoadMoreController extends HttpServlet {

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
        try {
            String amount = request.getParameter("exits");
            int iamount = Integer.parseInt(amount);
            ProductDAO dao = new ProductDAO();
            List<ProductDTO> list = dao.getNext3Product(iamount);
            PrintWriter out = response.getWriter();

            for (ProductDTO o : list) {
                out.println("<div class=\"product col-12 col-md-6 col-lg-4\" style=\"padding: 20px;\">\n" +
"                                <div class=\"card\" >\n" +
"                                    <img class=\"card-img-top\" src='"+ o.getImg()+"' alt=\"Card image cap\" style=\"object-fit: cover;width: 200px;\n" +
"  height: 150px;\">\n" +
"                                    <div class=\"card-body\">\n" +
"                                        \n" +
"                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">"+o.getName()+"</a></h4>\n" +
"                                        <p class=\"card-text show_txt\">"+o.getName()+"</p>\n" +
"                                        <div class=\"row\">\n" +
"                                            <div class=\"col\">\n" +
"                                                <p>"+o.getPrice()+"</p>\n" +
"                                            </div>\n" +
"                                            <div class=\"col\">\n" +
"                                                <div class=\"center\">\n" +
"                                                    <input type=\"submit\" name=\"action\" value=\"Add to Cart\" class=\"btn btn-primary\"/>\n" +
"                                                    <input type=\"hidden\" value=\""+o.getProductID()+"\" name=\"txtID\"/>\n" +
"                                                </div>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>");
            }
        } catch (Exception e) {
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
