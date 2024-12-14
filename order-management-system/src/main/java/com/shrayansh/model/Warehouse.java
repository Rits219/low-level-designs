package com.shrayansh.model;

import java.util.Map;

public class Warehouse {
    private Inventory inventory;
    private Address address;

    public Warehouse(Inventory inventory,Address address){
        this.inventory = inventory;
        this.address = address;
    }

    public void addInventory(Map<Integer, Integer> productCategoryIdVsCount){
        this.inventory.addProduct(productCategoryIdVsCount);
    }

    public void removeInventory(Map<Integer, Integer> productCategoryIdVsCount){
        this.inventory.removeProduct(productCategoryIdVsCount);
    }

    public boolean validateInventory(Map<Integer, Integer> productCategoryIdVsCount){
        return true;
    }

    public void show() {
        inventory.show();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
