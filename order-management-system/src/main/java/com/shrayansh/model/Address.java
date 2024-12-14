package com.shrayansh.model;

public class Address {
    private int id;
    private int pincode;
    private String city;
    private String address;

    public Address(int pincode, String city, String address) {
        this.id = Util.getRandomId();
        this.pincode = pincode;
        this.city = city;
        this.address = address;
    }

}
