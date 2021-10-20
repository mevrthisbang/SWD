/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import swd.dao.ProductDAO;
import swd.dto.AccountDTO;
import swd.dto.ProductDTO;
import swd.object.ProductErrorObject;

/**
 *
 * @author mevrthisbang
 */
public class UpdateController extends HttpServlet {

   private static final String ERROR = "error.jsp";
    private static final String SUCCESS = "SearchController";
    private static final String INVALID = "updateForm.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            AccountDTO loginUser = (AccountDTO) session.getAttribute("USER");
            if (loginUser != null && loginUser.getRole().equals("admin")) {
                boolean isMultipart = ServletFileUpload.isMultipartContent(request);
                if (isMultipart) {
                    FileItemFactory factory = new DiskFileItemFactory();
                    ServletFileUpload upload = new ServletFileUpload(factory);
                    List<FileItem> items = upload.parseRequest(request);
                    Hashtable params = new Hashtable();
                    FileItem itemFile = null;
                    for (FileItem item : items) {
                        if (item.isFormField()) {
                            params.put(item.getFieldName(), item.getString());
                        } else {
                            itemFile = item;
                        }
                    }
                    //get parameter
                    String name = (String) params.get("txtName");
                    String inputPrice = (String) params.get("txtPrice");
                    String description = (String) params.get("txtDescription");
                    String inputQuantity = (String) params.get("txtQuantity");
                    String category = (String) params.get("category");
                    String productID = (String) params.get("txtID");
                    String imgURL = (String) params.get("imgURL");
                    String status = (String) params.get("cboStatus");
                    boolean valid = true;
                    ProductErrorObject errorObject = new ProductErrorObject();
                    if (name.isEmpty()) {
                        errorObject.setNameError("Name is not supposed to be empty");
                        valid = false;
                    }
                    float price = 0;
                    try {
                        price = Float.parseFloat(inputPrice);
                        if (price <= 0) {
                            throw new Exception();
                        }
                    } catch (NumberFormatException e) {
                        errorObject.setPriceError("Input number for price");
                        valid = false;
                    } catch (Exception e) {
                        errorObject.setPriceError("Price must > 0");
                        valid = false;
                    }
                    int quantity = 0;
                    try {
                        quantity = Integer.parseInt(inputQuantity);
                        if (quantity < 0) {
                            throw new Exception();
                        }
                    } catch (NumberFormatException e) {
                        errorObject.setQuantityError("Input number for quantity");
                        valid = false;
                    } catch (Exception e) {
                        errorObject.setQuantityError("Quantity must > 0");
                        valid = false;
                    }
                    if (description.isEmpty()) {
                        errorObject.setDescriptionError("Description is not supposed to be empty");
                        valid = false;
                    }
                    ProductDTO product = new ProductDTO(productID, name, imgURL, price);
                    product.setCategory(category);
                    product.setDescription(description);
                    product.setQuantity(quantity);
                    product.setStatus(status);
                    if (valid) {
                        //upload image
                        if (itemFile != null & !itemFile.getName().isEmpty()) {
                            String fileImg = getServletContext().getRealPath("") + File.separator + imgURL;
                            File savedFile = new File(fileImg);
                            if (savedFile.exists()) {
                                savedFile.delete();
                            }
                            itemFile.write(savedFile);
                        }
                        ProductDAO dao = new ProductDAO();

                        if (dao.update(product, loginUser.getId())) {
                            url = SUCCESS;
                        } else {
                            request.setAttribute("ERROR", "Update failed");
                        }
                    } else {
                        url = INVALID;
                        request.setAttribute("INVALID", errorObject);
                        request.setAttribute("PRODUCT", product);
                    }
                }
            } else {
                request.setAttribute("ERROR", "You do not have permission to do this.");
            }

        } catch (Exception e) {
            log("ERROR at UpdateController: " + e.getMessage());
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
