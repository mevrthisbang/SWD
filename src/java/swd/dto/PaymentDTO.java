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
public class PaymentDTO implements Serializable{
    private String id, paymentMethod;

    public PaymentDTO() {
    }

    public PaymentDTO(String id, String paymentMethod) {
        this.id = id;
        this.paymentMethod = paymentMethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}
