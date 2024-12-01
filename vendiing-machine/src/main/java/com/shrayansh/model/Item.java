package com.shrayansh.model;

public class Item {
    private double price;
    private ItemType itemType;

    public Item(ItemType itemType, double price) {
        this.itemType = itemType;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getPrice() {
        return price;
    }
}
