/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import swd.dao.CategoryDAO;
import swd.dao.ProductDAO;
import swd.dto.AccountDTO;
import swd.dto.CategoryDTO;
import swd.dto.ProductDTO;

/**
 *
 * @author mevrthisbang
 */
public class SearchController extends HttpServlet {

    private static final String ADMIN = "adminHome.jsp";
    private static final String GUEST_USER = "guestCustomerHome.jsp";
    private static final String ERROR = "error.jsp";

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        ServletContext context = getServletContext();
        try {
            CategoryDAO cateDAO = new CategoryDAO();
            List<CategoryDTO> listCategories = cateDAO.getAllCategories();
            context.setAttribute("listCategories", listCategories);
        } catch (Exception e) {
            log("ERROR at SearchController-init:" + e.getMessage());
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;

        try {
            String search = request.getParameter("txtSearch");
            if (search == null) {
                search = "";
            }
            ProductDAO dao = new ProductDAO();
            float moneyFrom = 0;
            float moneyTo = 0;
            if (request.getParameter("txtFrom") != null && request.getParameter("txtTo") != null) {
                if (!request.getParameter("txtFrom").isEmpty()) {
                    moneyFrom = Float.parseFloat(request.getParameter("txtFrom"));
                }
                if (!request.getParameter("txtTo").isEmpty()) {
                    moneyTo = Float.parseFloat(request.getParameter("txtTo"));
                }
            }
            String cateID = request.getParameter("cboCategory");
            if (cateID == null) {
                cateID = "";
            }
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            List<ProductDTO> listProduct = null;
            int noOfRecords = 0;
            if (loginUser != null) {
                if (loginUser.getRole().equals("admin")) {
                    int page = 1;
                    int recordsPerPage = 4;
                    if (request.getParameter("page") != null&&!request.getParameter("page").isEmpty()) {
                        page = Integer.parseInt(request.getParameter("page"));
                    }
                    listProduct = dao.searchProductAdmin((page - 1) * recordsPerPage, recordsPerPage, search, moneyFrom, moneyTo, cateID);
                    noOfRecords = dao.getNumbersOfProductBySearchForAdmin(search, moneyFrom, moneyTo, cateID);
                    int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
                    request.setAttribute("noOfPages", noOfPages);
                    request.setAttribute("currentPage", page);
                    url = ADMIN;
                } else if (loginUser.getRole().equals("customer")){
                listProduct = dao.getTop6();
                url = GUEST_USER;
                }  else {
                    request.setAttribute("ERROR", "Your role is invalid");
                }
            } else {
                listProduct = dao.getTop6();
                url = GUEST_USER;
            }

            
//            if (!listFood.isEmpty() && listFood.size() > 2) {
//                int page = 1;
//                int recordsPerPage = 2;
//                if (request.getParameter("page") != null) {
//                    page = Integer.parseInt(request.getParameter("page"));
//                }
//                int currentRowIndex = (page - 1) * recordsPerPage;
//                int nextRowIndex = (page - 1) * recordsPerPage + recordsPerPage;
//                if (nextRowIndex > listFood.size()) {
//                    nextRowIndex = listFood.size();
//                }
//                int noOfRecords = listFood.size();
//                listFood = listFood.subList(currentRowIndex, nextRowIndex);
//                int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
//                request.setAttribute("noOfPages", noOfPages);
//                request.setAttribute("currentPage", page);
//            }
            request.setAttribute("listProduct", listProduct);
        } catch (Exception e) {
            log("ERROR at SearchController: " + e.getMessage());
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
