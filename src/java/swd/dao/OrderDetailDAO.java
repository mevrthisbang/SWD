/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import swd.db.DBConnection;
import swd.dto.OrderDetailDTO;

/**
 *
 * @author mevrthisbang
 */
public class OrderDetailDAO {

    private Connection conn;
    private PreparedStatement preStmOrderDetail;
    private ResultSet rs;

    private List<OrderDetailDTO> listItem;

    public List<OrderDetailDTO> ListItemInOrder() throws NamingException, SQLException {
        return listItem;
    }

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStmOrderDetail != null) {
            preStmOrderDetail.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public void getItem(String orderIDGet) throws Exception {
        try {
            conn = DBConnection.getMyConnection();
            if (conn != null) {
                String sql = "SELECT orderDetailID, orderID, productID, quantity, price"
                        + " FROM ORDER_DETAIL Where orderID = ?";
                preStmOrderDetail = conn.prepareStatement(sql);
                preStmOrderDetail.setString(1, orderIDGet);
                rs = preStmOrderDetail.executeQuery();
                while (rs.next()) {
                    String orderDetailID = rs.getString("orderDetailID");
                    String orderID = rs.getString("orderID");
                    String productID = rs.getString("productID");
                    int quantity = rs.getInt("quantity");
                    float price = rs.getFloat("price");
                    OrderDetailDTO dto = new OrderDetailDTO(orderDetailID, orderID, productID, quantity, price);
                    if (this.listItem == null) {
                        this.listItem = new ArrayList<>();
                    }
                    this.listItem.add(dto);
                }
            }
        } finally {
            closeConnection();
        }
    }

    public OrderDetailDTO getOrderDetail(String orderDetailID) throws Exception {
        OrderDetailDTO dto = null;
        try {
            conn = DBConnection.getMyConnection();
            if (conn != null) {
                String sql = "SELECT orderDetailID, orderID, productID, quantity, price"
                        + " FROM ORDER_DETAIL Where orderDetailID = ?";
                preStmOrderDetail = conn.prepareStatement(sql);
                preStmOrderDetail.setString(1, orderDetailID);
                rs = preStmOrderDetail.executeQuery();
                while (rs.next()) {
                    String orderID = rs.getString("orderID");
                    String productID = rs.getString("productID");
                    int quantity = rs.getInt("quantity");
                    float price = rs.getFloat("price");
                    dto = new OrderDetailDTO(orderDetailID, orderID, productID, quantity, price);
                }
            }
        } finally {
            closeConnection();
        }
        return dto;
    }
}
