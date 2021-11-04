/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dto;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ReviewDTO {

    private String reviewID, customerID, productID, orderID, content, status, customerName;
    private Date createDate, updateDate;
    private Float rating;

    public ReviewDTO() {
    }

    public ReviewDTO(String customerID, String productID, String orderID, String content, String status, Float rating) {
        this.customerID = customerID;
        this.productID = productID;
        this.orderID = orderID;
        this.content = content;
        this.status = status;
        this.rating = rating;
    }

    public ReviewDTO(String reviewID, String customerID, String productID, String orderID, String content, String status, Float rating) {
        this.reviewID = reviewID;
        this.customerID = customerID;
        this.productID = productID;
        this.orderID = orderID;
        this.content = content;
        this.status = status;
        this.rating = rating;
    }

    public ReviewDTO(String reviewID, String customerID, String customerName, String productID, String orderID, String content, String status, Date createDate, Date updateDate, Float rating) {
        this.reviewID = reviewID;
        this.customerID = customerID;
        this.customerName = customerName;
        this.productID = productID;
        this.orderID = orderID;
        this.content = content;
        this.status = status;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.rating = rating;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

}
