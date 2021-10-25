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
import swd.dto.PaymentDetailDTO;

/**
 *
 * @author Admin
 */
public class PaymentDetailDAO {

    private Connection conn;
    private PreparedStatement preStmPaymentDetail;
    private ResultSet rs;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStmPaymentDetail != null) {
            preStmPaymentDetail.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public PaymentDetailDTO getPaymentDetailByOrder(String orderID) throws Exception {
        PaymentDetailDTO dto = null;
        try {
            conn = DBConnection.getMyConnection();
            if (conn != null) {
                String sql = "Select paymentDetailID, paymentMethod, orderID, account_number, payment_status "
                        + "From PAYMENT_DETAIL where orderID = ?";
                preStmPaymentDetail = conn.prepareStatement(sql);
                preStmPaymentDetail.setString(1, orderID);
                rs = preStmPaymentDetail.executeQuery();
                while (rs.next()) {
                    String paymentDetailID = rs.getString("paymentDetailID");
                    String paymendMethod = rs.getString("paymentMethod");
                    String accountNumber = rs.getString("account_number");
                    String paymentStatus = rs.getString("payment_status");
                    dto = new PaymentDetailDTO(paymentDetailID, paymendMethod, orderID, accountNumber, paymentStatus);
                }
            }
        } finally {
            closeConnection();
        }
        return dto;
    }

}
