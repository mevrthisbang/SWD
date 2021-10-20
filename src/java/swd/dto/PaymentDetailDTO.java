/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swd.dto;

import java.io.Serializable;

/**
 *
 * @author mevrthisbang
 */
public class PaymentDetailDTO implements Serializable{
    private String paymentDetailID, paymendMethod, orderID, accountNumber, paymentStatus;

    public PaymentDetailDTO() {
    }

    public PaymentDetailDTO(String paymentDetailID, String paymendMethod, String orderID, String accountNumber, String paymentStatus) {
        this.paymentDetailID = paymentDetailID;
        this.paymendMethod = paymendMethod;
        this.orderID = orderID;
        this.accountNumber = accountNumber;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDetailID() {
        return paymentDetailID;
    }

    public void setPaymentDetailID(String paymentDetailID) {
        this.paymentDetailID = paymentDetailID;
    }

    public String getPaymendMethod() {
        return paymendMethod;
    }

    public void setPaymendMethod(String paymendMethod) {
        this.paymendMethod = paymendMethod;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
