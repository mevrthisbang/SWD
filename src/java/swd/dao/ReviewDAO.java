/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import swd.db.DBConnection;
import swd.dto.ReviewDTO;

/**
 *
 * @author Admin
 */
public class ReviewDAO {
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
    
    public boolean createReview(ReviewDTO dto) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Insert Into REVIEW(reviewID, customer, orderID, productID, review_rate, review_comment, status)\n"
                    + "Values(?,?,?,?,?,?,?)";
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getReviewID());
            preStm.setString(2, dto.getCustomerID());
            preStm.setString(3, dto.getOrderID());
            preStm.setString(4, dto.getProductID());
            preStm.setFloat(5, dto.getRating());
            preStm.setString(6, dto.getContent());
            preStm.setString(7, dto.getStatus());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    } 
    
    public String getLastReviewID() throws Exception {
        String result = null;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select reviewID From REVIEW\n"
                    + "Where create_at=(Select MAX(create_at)\n"
                    + "From REVIEW)\n";
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            if (rs.next()) {
                result = rs.getString("reviewID");
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public boolean deleteReview(String reviewID) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Update REVIEW set status = ? Where reviewID = ?";
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, reviewID);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
