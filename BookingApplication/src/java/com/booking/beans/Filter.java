/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author AMANI
 */
@ManagedBean
@SessionScoped
public class Filter {

    private String destinationName;
    private String minTripStartDate;
    private String maxTripStartDate;
    private String lengthOfStay;
    private String minStarRating;
    private String maxStarRating;
    private String minTotalRating;
    private String maxTotalRating;
    private String minGuestRating;
    private String maxGuestRating;

    /**
     * Creates a new instance of Filter
     */
    public Filter() {
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName != null && 
                destinationName.length() > 0 ? destinationName : null;
    }

    public void setMinTripStartDate(String minTripStartDate) {
        this.minTripStartDate = minTripStartDate != null && 
                minTripStartDate.length() > 0 ? minTripStartDate : null;
    }

    public void setMaxTripStartDate(String maxTripStartDate) {
        this.maxTripStartDate = maxTripStartDate != null && 
                maxTripStartDate.length() > 0 ? maxTripStartDate : null;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay != null && 
                lengthOfStay.length() > 0 ? lengthOfStay : null;
    }

    public void setMinStarRating(String minStarRating) {
        this.minStarRating = minStarRating != null && 
                minStarRating.length() > 0 ? minStarRating : null;
    }

    public void setMaxStarRating(String maxStarRating) {
        this.maxStarRating = maxStarRating != null && 
                maxStarRating.length() > 0 ? maxStarRating : null;
    }

    public void setMinTotalRating(String minTotalRating) {
        this.minTotalRating = minTotalRating != null && 
                minTotalRating.length() > 0 ? minTotalRating : null;
    }

    public void setMaxTotalRating(String maxTotalRating) {
        this.maxTotalRating = maxTotalRating != null && 
                maxTotalRating.length() > 0 ? maxTotalRating : null;
    }

    public void setMinGuestRating(String minGuestRating) {
        this.minGuestRating = minGuestRating != null && 
                minGuestRating.length() > 0 ? minGuestRating : null;
    }

    public void setMaxGuestRating(String maxGuestRating) {
        this.maxGuestRating = maxGuestRating != null && 
                maxGuestRating.length() > 0 ? maxGuestRating : null;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getMinTripStartDate() {
        return minTripStartDate;
    }

    public String getMaxTripStartDate() {
        return maxTripStartDate;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public String getMinStarRating() {
        return minStarRating;
    }

    public String getMaxStarRating() {
        return maxStarRating;
    }

    public String getMinTotalRating() {
        return minTotalRating;
    }

    public String getMaxTotalRating() {
        return maxTotalRating;
    }

    public String getMinGuestRating() {
        return minGuestRating;
    }

    public String getMaxGuestRating() {
        return maxGuestRating;
    }

    @Override
    public String toString() {
        return "Filter{" + "destinationName=" + destinationName + ", minTripStartDate=" + minTripStartDate + ", maxTripStartDate=" + maxTripStartDate + ", lengthOfStay=" + lengthOfStay + ", minStarRating=" + minStarRating + ", maxStarRating=" + maxStarRating + ", minTotalRating=" + minTotalRating + ", maxTotalRating=" + maxTotalRating + ", minGuestRating=" + minGuestRating + ", maxGuestRating=" + maxGuestRating + '}';
    }
}
