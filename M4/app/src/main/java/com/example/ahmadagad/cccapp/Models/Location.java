package com.example.ahmadagad.cccapp.Models;

/**
 * main class
 */
public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String type;
    private String phone;

    /**
     * empty constructer
     */
    public Location() {
        //empty Location instance created
    }

// --Commented out by Inspection START (11/8/18, 12:39 PM):
//    /**
//     * @param key of location
//     * @param name of location
//     * @param latitude of location
//     * @param longitude of location
//     * @param streetAddress of location
//     * @param city of location
//     * @param state of location
//     * @param zip of location
//     * @param type of location
//     * @param phone of location
//     * @param website of location
//     */
//    public Location(int key, String name, double latitude, double longitude,
//                    String streetAddress, String city, String state,
//                    String zip, String type, String phone,
//                    String website) {
//        this.key = key;
//        this.name = name;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.type = type;
//        this.phone = phone;
//        this.website = website;
//    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

// --Commented out by Inspection START (11/8/18, 12:39 PM):
//    /**
//     * @return getter for key
//     */
//    public int getKey() {
//        return key;
//    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

    /**
     * @param key setter
     */
    public void setKey(int key) {
    }

    /**
     * @return getter for name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name setter
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return getter for latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude setter
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return getter for longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude setter for longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return getter for adress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress setter
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * @return getter for city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city setter
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return getter for state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state setter
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return getter for zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip setter for zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return getter for type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type setter for type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return getter for number
     */
    public String getPhoneNumber() {
        return phone;
    }

    /**
     * @param phoneNumber setter for number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phone = phoneNumber;
    }

// --Commented out by Inspection START (11/8/18, 12:39 PM):
//    /**
//     * @return getter for website
//     */
//    public String getWebsite() {
//        return website;
//    }
// --Commented out by Inspection STOP (11/8/18, 12:39 PM)

    /**
     * @param website setter for website
     */
    public void setWebsite(String website) {
    }

    @Override
    public String toString() {
        return "Location Name: " + name;
    }
}
