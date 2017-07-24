/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.beans;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.json.simple.JSONArray;

/**
 *
 * @author AMANI
 */
@ManagedBean
@RequestScoped
public class Offer {

    private int id;

    //Offer Date Range
    private Calendar travelEndDate;
    private String travelEndDateText;
    private Long lengthOfStay;
    private Calendar travelStartDate;
    private String travelStartDateText;
    //Hotel Scores
    private Double rawAppealScore;
    private Double movingAverageScore;
    //Hotel Info
    private Double hotelLatitude;
    private Double hotelStarRating;
    private Double hotelGuestReviewRating;
    private String description;
    private String language;
    private String promotionTag;
    private String hotelDestination;
    private Boolean allInclusive;
    private String hotelLongDestination;
    private String hotelCity;
    private String hotelStreetAddress;
    private Double carPackageScore;
    private Double hotelLongitude;
    private String hotelCountryCode;
    private Boolean carPackage;
    private String hotelId;
    private String hotelName;
    private String hotelDestinationRegionID;
    private String hotelLocation;
    private String hotelImageUrl;
    private String promotionDescription;
    private String statusDescription;
    private Double relevanceScore;
    private Double distanceFromUser;
    private String hotelProvince;
    private Double promotionAmount;
    private String statusCode;
    //Hotel Urgency Info
    private Long airAttachRemainingTime;
    private Long lastBookedTime;
    private Long numberOfRoomsLeft;
    private Long numberOfPeopleViewing;
    private Long numberOfPeopleBooked;
    private String link;
    private String almostSoldOutRoomTypeInfoCollection;
    private String almostSoldStatus;
    private Boolean airAttachEnabled;
    //Destination
    private String country;
    private String province;
    private String regionID;
    private String city;
    private String longName;
    //Hotel Pricing Info
    private Double hotelTotalTaxesAndFees;
    private Boolean drr;
    private Double totalPriceValue;
    private Double hotelTotalMandatoryTaxesAndFees;
    private Double hotelTotalBaseRate;
    private String currency;
    private Double originalPricePerNight;
    private Double averagePriceValue;
    private Double percentSavings;
    //Hotel URLs
    private String hotelSearchResultUrl;
    private String hotelInfositeUrl;

    /**
     * Creates a new instance of Offer
     */
    public Offer() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getTravelEndDate() {
        return travelEndDate;
    }

    public String getTravelEndDateText() {
        return travelEndDateText;
    }
    
    public void setTravelEndDate(JSONArray travelEndDateArr) throws ParseException {
        Calendar date;
        
        this.travelEndDateText = travelEndDateArr.get(2) + "-" + travelEndDateArr.get(1) + "-" + travelEndDateArr.get(0);        
        date = Calendar.getInstance();
        date.setTimeInMillis(new SimpleDateFormat("dd-MM-yyyy").parse(this.travelEndDateText).getTime());
        this.travelEndDate = date;
    }

    public void setTravelEndDate(String travelEndDate) throws ParseException{
        Calendar date;
          
        date = Calendar.getInstance();
        date.setTimeInMillis(new SimpleDateFormat("MM/dd/yyyy").parse(travelEndDate).getTime());
        this.travelEndDate = date;
        this.travelEndDateText = new SimpleDateFormat("dd-MM-yyyy").format(date.getTime());
    }
    
    public Long getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Long lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public Calendar getTravelStartDate() {
        return travelStartDate;
    }

    public String getTravelStartDateText() {
        return travelStartDateText;
    }

    public void setTravelStartDate(JSONArray travelStartDateArr) throws ParseException {
        Calendar date;
        
        this.travelStartDateText = travelStartDateArr.get(2) + "-" + travelStartDateArr.get(1) + "-" + travelStartDateArr.get(0);        
        date = Calendar.getInstance();
        date.setTimeInMillis(new SimpleDateFormat("dd-MM-yyyy").parse(this.travelStartDateText).getTime());
        this.travelStartDate = date;
    }

    public void setTravelStartDate(String travelStartDate) throws ParseException {
        Calendar date;
        
        date = Calendar.getInstance();
        date.setTimeInMillis(new SimpleDateFormat("MM/dd/yyyy").parse(travelStartDate).getTime());
        this.travelStartDate = date;
        this.travelStartDateText = new SimpleDateFormat("dd-MM-yyyy").format(date.getTime());
    }
    
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public Double getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = Double.valueOf(hotelStarRating);
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public Boolean getAllInclusive() {
        return allInclusive;
    }

    public void setAllInclusive(Boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public Double getCarPackageScore() {
        return carPackageScore;
    }

    public void setCarPackageScore(Double carPackageScore) {
        this.carPackageScore = carPackageScore;
    }

    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public Boolean getCarPackage() {
        return carPackage;
    }

    public void setCarPackage(Boolean carPackage) {
        this.carPackage = carPackage;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Double getRelevanceScore() {
        return relevanceScore;
    }

    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    public Double getDistanceFromUser() {
        return distanceFromUser;
    }

    public void setDistanceFromUser(Double distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Long getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(Long airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public Long getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(Long lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public Long getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(Long numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public Long getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(Long numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public Long getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(Long numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(JSONArray almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = "";
        for (int i = 0; i < almostSoldOutRoomTypeInfoCollection.size(); i++) {
            this.almostSoldOutRoomTypeInfoCollection += (String) almostSoldOutRoomTypeInfoCollection.get(i);
            if(i < almostSoldOutRoomTypeInfoCollection.size()-1){
                this.almostSoldOutRoomTypeInfoCollection += ", ";
            }
        }
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        try {
            this.hotelSearchResultUrl = URLDecoder.decode(hotelSearchResultUrl, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
            this.hotelSearchResultUrl = hotelSearchResultUrl;
        }
    }

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        try {
            this.hotelInfositeUrl = URLDecoder.decode(hotelInfositeUrl, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
            this.hotelInfositeUrl = hotelInfositeUrl;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Offer other = (Offer) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return "Offer{" + "id=" + id + ", travelEndDate=" + format.format(travelEndDate.getTime()) + ", lengthOfStay=" + lengthOfStay + ", travelStartDate=" + format.format(travelStartDate.getTime()) + ", rawAppealScore=" + rawAppealScore + ", movingAverageScore=" + movingAverageScore + ", hotelLatitude=" + hotelLatitude + ", hotelStarRating=" + hotelStarRating + ", hotelGuestReviewRating=" + hotelGuestReviewRating + ", description=" + description + ", language=" + language + ", promotionTag=" + promotionTag + ", hotelDestination=" + hotelDestination + ", allInclusive=" + allInclusive + ", hotelLongDestination=" + hotelLongDestination + ", hotelCity=" + hotelCity + ", hotelStreetAddress=" + hotelStreetAddress + ", carPackageScore=" + carPackageScore + ", hotelLongitude=" + hotelLongitude + ", hotelCountryCode=" + hotelCountryCode + ", carPackage=" + carPackage + ", hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelDestinationRegionID=" + hotelDestinationRegionID + ", hotelLocation=" + hotelLocation + ", hotelImageUrl=" + hotelImageUrl + ", promotionDescription=" + promotionDescription + ", statusDescription=" + statusDescription + ", relevanceScore=" + relevanceScore + ", distanceFromUser=" + distanceFromUser + ", hotelProvince=" + hotelProvince + ", promotionAmount=" + promotionAmount + ", statusCode=" + statusCode + ", airAttachRemainingTime=" + airAttachRemainingTime + ", lastBookedTime=" + lastBookedTime + ", numberOfRoomsLeft=" + numberOfRoomsLeft + ", numberOfPeopleViewing=" + numberOfPeopleViewing + ", numberOfPeopleBooked=" + numberOfPeopleBooked + ", link=" + link + ", almostSoldOutRoomTypeInfoCollection=" + almostSoldOutRoomTypeInfoCollection + ", almostSoldStatus=" + almostSoldStatus + ", airAttachEnabled=" + airAttachEnabled + ", country=" + country + ", province=" + province + ", regionID=" + regionID + ", city=" + city + ", longName=" + longName + ", hotelTotalTaxesAndFees=" + hotelTotalTaxesAndFees + ", drr=" + drr + ", totalPriceValue=" + totalPriceValue + ", hotelTotalMandatoryTaxesAndFees=" + hotelTotalMandatoryTaxesAndFees + ", hotelTotalBaseRate=" + hotelTotalBaseRate + ", currency=" + currency + ", originalPricePerNight=" + originalPricePerNight + ", averagePriceValue=" + averagePriceValue + ", percentSavings=" + percentSavings + ", hotelSearchResultUrl=" + hotelSearchResultUrl + ", hotelInfositeUrl=" + hotelInfositeUrl + '}';
    }
}
