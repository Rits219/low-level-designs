package com.shrayansh.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Address> addressList;
    private Cart cart;

    public User(String name) {
        this.id = Util.getRandomId();
        this.name = name;
        this.addressList = new ArrayList<>();
        this.cart = null;
    }

    public void addAddress(Address address) {
        addressList.add(address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
