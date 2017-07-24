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
public class OfferInfo {

    private String siteID;
    private String language;
    private String currency;

    /**
     * Creates a new instance of OfferInfo
     */
    public OfferInfo() {
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "OfferInfo{" + "siteID=" + siteID + ", language=" + language + ", currency=" + currency + '}';
    }
}
