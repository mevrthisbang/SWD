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
public class NotificationDTO implements Serializable{
    private String id, idReceiver, content;

    public NotificationDTO() {
    }

    public NotificationDTO(String id, String idReceiver, String content) {
        this.id = id;
        this.idReceiver = idReceiver;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdReceiver() {
        return idReceiver;
    }

    public void setIdReceiver(String idReceiver) {
        this.idReceiver = idReceiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
