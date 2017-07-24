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
public class Persona {

    private String personaType;

    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return "Persona{" + "personaType=" + personaType + '}';
    }
}
