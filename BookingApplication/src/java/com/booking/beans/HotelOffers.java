/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.beans;

import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author AMANI
 */
@ManagedBean
@SessionScoped
public class HotelOffers {

    private OfferInfo offerInfo;
    private UserInfo userInfo;
    private ArrayList<Offer> offers;
    private ArrayList<Offer> filteredOffers;
    private Filter filter;

    /**
     * Creates a new instance of HotelOffers
     */
    public HotelOffers() throws Exception{
        this.filter = new Filter();
        this.getData();
    }

    public final void getData() throws Exception {
            readOffers();
            filterOffers();
    }
    
    private void readOffers() throws Exception {
        final Logger logger = Logger.getLogger(HotelOffers.class.getName());
            URL jsonURL;
            InputStreamReader reader;
            JSONParser parser;
            JSONObject jSONObject, userInfoJson, personaJSON, offerInfoJSON, dataJSON;
            Persona persona;
            JSONArray offersJSONArray;
            Offer offer;
            Object data;
            String methodName;
            Method method;

            //Parsing offers string to JSON object using json-simple-1.1.1.jar google library
            logger.log(Level.INFO, "Parsing offers string to JSON object");
            jsonURL = new URL("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");
            reader = new InputStreamReader(jsonURL.openStream());
            parser = new JSONParser();
            jSONObject = (JSONObject) parser.parse(reader);
            reader.close();
            
            //Reading User Info Properties
            logger.info("Reading User Info Properties");
            userInfoJson = (JSONObject) jSONObject.get("userInfo");
            personaJSON = (JSONObject) userInfoJson.get("persona");
            persona = new Persona();
            persona.setPersonaType((String) personaJSON.get("personaType"));
            userInfo = new UserInfo();
            userInfo.setUserId((String) userInfoJson.get("userId"));
            userInfo.setPersona(persona);

            //Reading Offer Info Properties
            logger.info("Reading Offer Info Properties");
            offerInfoJSON = (JSONObject) jSONObject.get("offerInfo");
            offerInfo = new OfferInfo();
            offerInfo.setSiteID((String) offerInfoJSON.get("siteID"));
            offerInfo.setLanguage((String) offerInfoJSON.get("language"));
            offerInfo.setCurrency((String) offerInfoJSON.get("currency"));

            //Reading Hotel Offers
            logger.info("Reading Hotel Offers");
            offersJSONArray = (JSONArray) ((JSONObject) jSONObject.get("offers")).get("Hotel");
            offers = new ArrayList<>();
            for (int i = 0; i < offersJSONArray.size(); i++) {
                offerInfoJSON = (JSONObject) offersJSONArray.get(i);
                offer = new Offer();
                offer.setId(i);
                for (Object k1 : offerInfoJSON.keySet()) {
                    dataJSON = (JSONObject) offerInfoJSON.get(k1);
                    for (Object k2 : dataJSON.keySet()) {
                        try {
                            data = dataJSON.get(k2);
                            if (k2 instanceof String) {
                                //Using code reflection to set offer properties
                                methodName = "set" + k2.toString().substring(0, 1).toUpperCase() + k2.toString().substring(1);
                                method = Offer.class.getDeclaredMethod(methodName, data.getClass());
                                method.invoke(offer, data);
                            } else {
                                logger.log(Level.WARNING, "data key is not string and it will be ignored, {0}={1}", new Object[]{k2, data});
                            }
                        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                            logger.log(Level.SEVERE, null, ex);
                        }
                    }
                }
                offers.add(offer);
            }
    }

    private void filterOffers() throws java.text.ParseException {
        Calendar date = Calendar.getInstance();
        final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        this.filteredOffers = new ArrayList<>();
        if(offers != null && offers.size() > 0){
            System.out.println(filter);
            for (Offer offer : offers) {
                System.out.println(offer);
                if(filter != null){
                    if(filter.getDestinationName()!= null && 
                            filter.getDestinationName().length() > 0 && 
                            !filter.getDestinationName().equalsIgnoreCase(offer.getHotelDestination())) {
                        continue;
                    }
                    if(filter.getMinTripStartDate() != null &&
                            filter.getMinTripStartDate().length() > 0){
                        date.setTime(format.parse(filter.getMinTripStartDate()));
                        if(offer.getTravelStartDate().before(date)){
                            continue;
                        }
                    }
                    if(filter.getMaxTripStartDate() != null &&
                            filter.getMaxTripStartDate().length() > 0){
                        date.setTime(format.parse(filter.getMaxTripStartDate()));
                        if(offer.getTravelStartDate().after(date)){
                            continue;
                        }
                    }
                    if(filter.getLengthOfStay() != null && 
                            Long.valueOf(filter.getLengthOfStay()) != offer.getLengthOfStay()){
                        continue;
                    }
                    if(filter.getMinStarRating() != null && 
                            offer.getHotelStarRating() < Double.valueOf(filter.getMinStarRating())){
                        continue;
                    }
                    if(filter.getMaxStarRating() != null && 
                            offer.getHotelStarRating() > Double.valueOf(filter.getMaxStarRating())){
                        continue;
                    }
                    if(filter.getMinTotalRating() != null && 
                            offer.getHotelTotalBaseRate() < Double.valueOf(filter.getMinTotalRating())){
                        continue;
                    }
                    if(filter.getMaxTotalRating() != null && 
                            offer.getHotelTotalBaseRate() > Double.valueOf(filter.getMaxTotalRating())){
                        continue;
                    }
                    if(filter.getMinGuestRating() != null && 
                            offer.getHotelGuestReviewRating() < Double.valueOf(filter.getMinGuestRating())){
                        continue;
                    }
                    if(filter.getMaxGuestRating() != null && 
                            offer.getHotelGuestReviewRating() > Double.valueOf(filter.getMaxGuestRating())){
                        continue;
                    }
                }
                this.filteredOffers.add(offer);
            }
        }
    }
    
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public ArrayList<Offer> getFilteredOffers() {
        return filteredOffers;
    }

    public Filter getFilter() {
        return filter;
    }
}
