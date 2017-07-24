/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author AMANI
 */
@ManagedBean
@RequestScoped
public class UserInfo {

    private String userId;
    private Persona persona;

    /**
     * Creates a new instance of UserInfo
     */
    public UserInfo() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    } 

    @Override
    public String toString() {
        return "UserInfo{" + "userId=" + userId + ", persona=" + persona + '}';
    }
}
