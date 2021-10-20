/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import swd.db.DBConnection;
import swd.dto.OrderDTO;
import swd.dto.PaymentDetailDTO;
import swd.dto.ProductDTO;

/**
 *
 * @author mevrthisbang
 */
public class OrderDAO implements Serializable {

    private Connection conn;
    private PreparedStatement preStmOrder;
    private PreparedStatement preStmOrderDetail;
    private PreparedStatement preStmPaymentDetail;
    private ResultSet rs;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStmOrderDetail != null) {
            preStmOrderDetail.close();
        }
        if (preStmOrder != null) {
            preStmOrder.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    public String getLastOrderIDByCustomer(String customerID) throws Exception {
        String result = null;
        try {
            conn = DBConnection.getMyConnection();
            String sql = "Select orderID From ORDER_PRODUCT\n"
                    + "Where buyDate=(Select MAX(buyDate)\n"
                    + "From ORDER_PRODUCT Where customer=?)";
            preStmOrder = conn.prepareStatement(sql);
            preStmOrder.setString(1, customerID);
            rs = preStmOrder.executeQuery();
            if (rs.next()) {
                result = rs.getString("orderID");
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
     public boolean insertOrder(OrderDTO order, HashMap<String, ProductDTO> listOrderDetail, PaymentDetailDTO paymentDetail) throws Exception {
        boolean check = false;
        try {
            conn = DBConnection.getMyConnection();
            String sqlInsertOrder = "Insert Into ORDER_PRODUCT(orderID, customer, buyerName, phone, shipAddress, status, total)\n"
                    + "Values(?,?,?,?,?,?,?)";
            String sqlInsertOrderDetail = "Insert Into ORDER_DETAIL(orderDetailID, orderID, productID, quantity, price)\n"
                    + "Values(?, ?, ?, ?, ?)";
            String sqlInsertPaymentDetail = "Insert Into PAYMENT_DETAIL(paymentDetailID, paymentMethod, orderID, account_number, payment_status)\n"
                    + "Values(?,?,?,?,?)";
            preStmOrder=conn.prepareStatement(sqlInsertOrder);
            preStmOrderDetail=conn.prepareStatement(sqlInsertOrderDetail);
            preStmPaymentDetail = conn.prepareStatement(sqlInsertPaymentDetail);
            conn.setAutoCommit(false);
            preStmOrder.setString(1, order.getOrderID());
            preStmOrder.setString(2, order.getCustomer());
            preStmOrder.setString(3, order.getBuyerName());
            preStmOrder.setString(4, order.getPhone());
            preStmOrder.setString(5, order.getAddress());
            preStmOrder.setString(6, order.getStatus());
            preStmOrder.setFloat(7, order.getTotal());
            int insertOrder=preStmOrder.executeUpdate();
            preStmPaymentDetail.setString(1, paymentDetail.getPaymentDetailID());
            preStmPaymentDetail.setString(2, paymentDetail.getPaymendMethod());
            preStmPaymentDetail.setString(3, paymentDetail.getOrderID());
            preStmPaymentDetail.setString(4, paymentDetail.getAccountNumber());
            preStmPaymentDetail.setString(5, paymentDetail.getPaymentStatus());
            int insertPayment=preStmPaymentDetail.executeUpdate();
            int insertOrderLine=0;
            int count=1;
            for(ProductDTO product: listOrderDetail.values()){
                preStmOrderDetail.setString(1, order.getOrderID()+"-"+count);
                count++;
                preStmOrderDetail.setString(2, order.getOrderID());
                preStmOrderDetail.setString(3, product.getProductID());
                preStmOrderDetail.setInt(4, product.getQuantity());
                preStmOrderDetail.setFloat(5, product.getPrice());
                insertOrderLine+=preStmOrderDetail.executeUpdate();
            }
            conn.commit();
            conn.setAutoCommit(true);
            check=insertOrder>0&&insertOrderLine>0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
