/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import swd.db.DBConnection;
import swd.dto.ProductDTO;

/**
 *
 * @author mevrthisbang
 */
public class ProductDAO {
    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    public List<ProductDTO> getTop6() throws Exception{
        List<ProductDTO> result = null;
        String query = "select top 6 productID, name, price, img from PRODUCT\n"
                +"WHERE status='Active'\n"
                + "ORDER BY createDate\n";
        ProductDTO dto = null;
        String id, name, img;
        float price;
        try {
            conn = DBConnection.getMyConnection();//mo ket noi voi sql
            preStm = conn.prepareStatement(query);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                id = rs.getString("productID");
                name = rs.getString("name");
                img = rs.getString("img");
                price = rs.getFloat("price");
                dto = new ProductDTO(id, name, img, price);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    public List<ProductDTO> getNext3Product(int amount) throws Exception{
        List<ProductDTO> result = null;
        ProductDTO dto = null;
        String id, name, img;
        float price;
        String query = "SELECT productID, name, price, img \n"
                + "  FROM PRODUCT\n"
                + " WHERE status='Active'\n"
                + "ORDER BY createDate\n"
                + "OFFSET ? ROWS\n"
                + " FETCH NEXT 3 ROWS ONLY";
        try {
            conn = DBConnection.getMyConnection();
            preStm = conn.prepareStatement(query);
            preStm.setInt(1, amount);
            rs = preStm.executeQuery();
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                id = rs.getString("productID");
                name = rs.getString("name");
                img = rs.getString("img");
                price = rs.getFloat("price");
                dto = new ProductDTO(id, name, img, price);
                result.add(dto);
            }
        } finally{
            closeConnection();
        }
        return result;
    }
    public int getNumbersOfProductBySearchForAdmin(String search, float from, float to, String cateID) throws Exception {
        int result = 0;
        try {
            conn = DBConnection.getMyConnection();
            String sql;
            if (from > 0 && to <= 0) {
                sql = "Select Count(*) as NoOfRecords\n"
                        + "From (\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where price>=? \n"
                        + "AND price<=(Select MAX(price) From PRODUCT)\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + ") I";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                preStm.setFloat(2, from);
                if (cateID.isEmpty()) {
                    preStm.setString(3, "%" + cateID + "%");
                } else {
                    preStm.setString(3, cateID);
                }
            } else if (from <= 0 && to <= 0) {
                sql = "Select Count(*) as NoOfRecords\n"
                        + "From (\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where  price>=(Select MIN(price) From PRODUCT) \n"
                        + "AND price<=(Select MAX(price) From PRODUCT)\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + ") I";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                if (cateID.isEmpty()) {
                    preStm.setString(2, "%" + cateID + "%");
                } else {
                    preStm.setString(2, cateID);
                }
            } else {
                sql = "Select Count(*) as NoOfRecords\n"
                        + "From (\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where price>=? \n"
                        + "AND price<=?\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + ") I";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                preStm.setFloat(2, from);
                preStm.setFloat(3, to);
                if (cateID.isEmpty()) {
                    preStm.setString(4, "%" + cateID + "%");
                } else {
                    preStm.setString(4, cateID);
                }
            }
            rs = preStm.executeQuery();
            if (rs.next()) {
                result = rs.getInt("NoOfRecords");
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<ProductDTO> searchProductAdmin(int offset, int pageSize, String search, float from, float to, String cateID) throws Exception {
        List<ProductDTO> result = null;
        ProductDTO dto = null;
        String id, name, img, status;
        float price;
        int quantity;
        try {
            conn = DBConnection.getMyConnection();
            String sql;
            if (from > 0 && to <= 0) {
                sql = "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where price>=?\n"
                        + "AND price<=(Select MAX(price) From PRODUCT)\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + "ORDER BY createDate\n"
                        + "OFFSET ? ROWS\n"
                        + "FETCH NEXT ? ROWS ONLY";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                preStm.setFloat(2, from);
                if (cateID.isEmpty()) {
                    preStm.setString(3, "%" + cateID + "%");
                } else {
                    preStm.setString(3, cateID);
                }
                preStm.setInt(4, offset);
                preStm.setInt(5, pageSize);
            } else if (from <= 0 && to <= 0) {
                sql = "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where price>=(Select MIN(price) From PRODUCT)\n"
                        + "AND price<=(Select MAX(price) From PRODUCT)\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + "ORDER BY createDate\n"
                        + "OFFSET ? ROWS\n"
                        + "FETCH NEXT ? ROWS ONLY";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                if (cateID.isEmpty()) {
                    preStm.setString(2, "%" + cateID + "%");
                } else {
                    preStm.setString(2, cateID);
                }
                preStm.setInt(3, offset);
                preStm.setInt(4, pageSize);

            } else {
                sql = "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where name LIKE ?\n"
                        + "INTERSECT\n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where price>=?\n"
                        + "AND price<=?\n"
                        + "INTERSECT \n"
                        + "Select productID, name, img, price, quantity, status, createDate\n"
                        + "From PRODUCT\n"
                        + "Where category LIKE ?\n"
                        + "ORDER BY createDate\n"
                        + "OFFSET ? ROWS\n"
                        + "FETCH NEXT ? ROWS ONLY";
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, "%" + search + "%");
                preStm.setFloat(2, from);
                preStm.setFloat(3, to);
                if (cateID.isEmpty()) {
                    preStm.setString(4, "%" + cateID + "%");
                } else {
                    preStm.setString(4, cateID);
                }
                preStm.setInt(5, offset);
                preStm.setInt(6, pageSize);
            }
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                id = rs.getString("productID");
                name = rs.getString("name");
                img = rs.getString("img");
                price = rs.getFloat("price");
                quantity = rs.getInt("quantity");
                status = rs.getString("status");
                dto = new ProductDTO(id, name, img, price);
                dto.setQuantity(quantity);
                dto.setStatus(status);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public String getLastProductID(String category) throws Exception {
        String result = null;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select productID From PRODUCT\n"
                    + "Where createDate=(Select MAX(CreateDate)\n"
                    + "From PRODUCT\n"
                    + "Where category = ?)";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, category);
            rs = preStm.executeQuery();
            if (rs.next()) {
                result = rs.getString("productID");
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    public boolean create(ProductDTO product, String createBy) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Insert Into PRODUCT(productID, name, price, img, description, quantity, createBy, category)\n"
                    + "Values(?,?,?,?,?,?,?,?)";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, product.getProductID());
            preStm.setString(2, product.getName());
            preStm.setFloat(3, product.getPrice());
            preStm.setString(4, product.getImg());
            preStm.setString(5, product.getDescription());
            preStm.setInt(6, product.getQuantity());
            preStm.setString(7, createBy);
            preStm.setString(8, product.getCategory());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    public boolean update(ProductDTO product, String updateBy) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Update PRODUCT\n"
                    + "Set name=?, price=?, description=?, status=?, quantity=?, category=?, updateBy=?, updateDate=GETDATE()\n"
                    + "Where productID=?";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, product.getName());
            preStm.setFloat(2, product.getPrice());
            preStm.setString(3, product.getDescription());
            preStm.setString(4, product.getStatus());
            preStm.setInt(5, product.getQuantity());
            preStm.setString(6, product.getCategory());
            preStm.setString(7, updateBy);
            preStm.setString(8, product.getProductID());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public ProductDTO getProductByPrimaryKey(String productID) throws Exception {
        ProductDTO result = null;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select name, price, img, description, status, quantity, category\n"
                    + "From PRODUCT\n"
                    + "Where productID=?";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, productID);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String img = rs.getString("img");
                float price = rs.getFloat("price");
                String description = rs.getString("description");
                String status = rs.getString("status");
                int quantity = rs.getInt("quantity");
                String category = rs.getString("category");
                result = new ProductDTO(productID, name, img, price);
                result.setCategory(category);
                result.setDescription(description);
                result.setQuantity(quantity);
                result.setStatus(status);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    public boolean delete(String id, String updateBy) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Update PRODUCT\n"
                    + "Set status='Inactive', updateBy=?, updateDate=GETDATE()\n"
                    + "Where productID=?";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, updateBy);
            preStm.setString(2, id);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
