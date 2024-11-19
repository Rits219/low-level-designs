package com.shrayansh;

public class Location {
    private int locationId;
    private String address;
    private String city;
    private String state;
    private int pinCode;
    private String country;

    public Location(String address, String city, String state, String country, int pinCode) {
        this.locationId = Util.getRandomInt();
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }
}
