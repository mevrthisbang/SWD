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
    private static final String SEARCHBYCATEGORY = "SearchByCategoryController";
    private static final String REMOVE = "RemoveFromCartController";
    private static final String ORDER = "OrderController";
    private static final String UPDATECART = "UpdateQuantityInCartController";
    private static final String PAYPAL = "PaypalController";
    private static final String SHOPPINGHISTORY = "ShoppingHistoryController";
    private static final String SHOWDETAILHISTORY = "ShowDetailHistoryController";
    private static final String REVIEWPRODUCT = "ReviewProductController";
    private static final String WRITEREVIEW = "WriteReviewController";
    private static final String VIEWPRODUCTDETAIL = "ViewDetailController";
    private static final String ORDER_LIST = "ShowListOrderController";
    private static final String SEARCH_ORDER = "SearchOrderController";
    private static final String ORDER_DETAIL = "ShowOrderDetailController";
    private static final String UPDATE_ORDER_STATUS = "UpdateOrderStatusController";

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
            } else if (action.equals("LoginWithGoogle")) {
                url = LOGINWITHGOOGLE;
            } else if (action.equals("Create")) {
                url = CREATE;
            } else if (action.equals("Edit")) {
                url = LOADBYPRIMARYKEY;
            } else if (action.equals("Update")) {
                url = UPDATE;
            } else if (action.equals("Delete")) {
                url = DISABLE;
            } else if (action.equals("Logout")) {
                url = LOGOUT;
            } else if (action.equals("load_more")) {
                url = LOADMORE;
            } else if (action.equals("Register")) {
                url = REGISTER;
            } else if (action.equals("AddToCart")) {
                url = ADDTOCART;
            } else if (action.equals("searchByCategory")) {
                url = SEARCHBYCATEGORY;
            } else if (action.equals("Remove")) {
                url = REMOVE;
            } else if (action.equals("Confirm Order")) {
                url = ORDER;
            } else if (action.equals("Update Cart")) {
                url = UPDATECART;
            } else if (action.equals("paypal")) {
                url = PAYPAL;
            } else if (action.equals("shoppingHistory")) {
                url = SHOPPINGHISTORY;
            } else if (action.equals("showDetailHistory")) {
                url = SHOWDETAILHISTORY;
            } else if (action.equals("Review Product")) {
                url = REVIEWPRODUCT;
            } else if (action.equals("Review")) {
                url = WRITEREVIEW;
            } else if (action.equals("Cancel Review")) {
                url = SHOPPINGHISTORY;
            } else if (action.equals("ViewProductDetail")) {
                url = VIEWPRODUCTDETAIL;
            }   else if (action.equals("orderList")) {
                url = ORDER_LIST;
            }   else if (action.equals("Search Order")) {
                url = SEARCH_ORDER;
            }   else if (action.equals("orderDetail")) {
                url = ORDER_DETAIL;
            }   else if (action.equals("Update Status")) {
                url = UPDATE_ORDER_STATUS;
            }   else {
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
