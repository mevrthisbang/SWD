/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mevrthisbang
 */
public class OrderDTO implements Serializable {

    private String orderID, customer, buyerName, phone, shippingAddress, status;
    private Date buyDate;
    private float total;

    public OrderDTO() {
    }

    public OrderDTO(String orderID, String customer, String buyerName, String phone, String address) {
        this.orderID = orderID;
        this.customer = customer;
        this.buyerName = buyerName;
        this.phone = phone;
        this.shippingAddress = address;
    }

    public OrderDTO(String orderID, String customer, String buyerName, Date buyDate, String phone, String shippingAddress, float total, String status) {
        this.orderID = orderID;
        this.customer = customer;
        this.buyerName = buyerName;
        this.phone = phone;
        this.shippingAddress = shippingAddress;
        this.status = status;
        this.buyDate = buyDate;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = -23 * hash + Objects.hashCode(this.buyDate);
        return hash;
    }
}
