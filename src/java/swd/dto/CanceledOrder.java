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
public class CanceledOrder implements Serializable{
    private String cancelOrderID, cancelUser, cancelReason;

    public CanceledOrder() {
    }

    public CanceledOrder(String cancelOrderID, String cancelUser, String cancelReason) {
        this.cancelOrderID = cancelOrderID;
        this.cancelUser = cancelUser;
        this.cancelReason = cancelReason;
    }

    public String getCancelOrderID() {
        return cancelOrderID;
    }

    public void setCancelOrderID(String cancelOrderID) {
        this.cancelOrderID = cancelOrderID;
    }

    public String getCancelUser() {
        return cancelUser;
    }

    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    
    
}
