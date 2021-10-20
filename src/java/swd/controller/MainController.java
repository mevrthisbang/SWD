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

/**
 *
 * @author mevrthisbang
 */
public class MainController extends HttpServlet {
    
    private static final String ERROR = "error.jsp";
    private static final String LOGIN = "LoginController";
    private static final String SEARCH = "SearchController";
    private static final String LOGINWITHGOOGLE = "LoginWithGoogleController";
    private static final String CREATE = "CreateProductController";
    private static final String LOADBYPRIMARYKEY = "GetProductByPrmaryKeyController";
    private static final String UPDATE = "UpdateController";
    private static final String DISABLE = "DisableController";
    private static final String LOGOUT = "LogoutController";
    private static final String LOADMORE = "LoadMoreController";
    private static final String REGISTER = "RegisterAccountController";
    private static final String ADDTOCART = "AddToCartController";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if (action == null || action.equals("Search")) {
                url = SEARCH;
            } else if (action.equals("Login")) {
                url = LOGIN;
            }else if (action.equals("LoginWithGoogle")) {
                url = LOGINWITHGOOGLE;
            }else if (action.equals("Create")) {
                url = CREATE;
            }else if (action.equals("Edit")) {
                url = LOADBYPRIMARYKEY;
            } else if (action.equals("Update")) {
                url = UPDATE;
            }else if (action.equals("Delete")) {
                url = DISABLE;
            }else if (action.equals("Logout")) {
                url = LOGOUT;
            }else if (action.equals("load_more")) {
                url = LOADMORE;
            }else if (action.equals("Register")) {
                url = REGISTER;
            }else if (action.equals("AddToCart")) {
                url = ADDTOCART;
            }else{
                request.setAttribute("ERROR", "Your action is invalid");
            }
        } catch (Exception e) {
            log("ERROR at MainController: " + e.getMessage());
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
