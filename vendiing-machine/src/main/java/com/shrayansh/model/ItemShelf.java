package com.shrayansh.model;

public class ItemShelf {
    private Item item;
    private int codeNumber;
    private boolean soldOut;

    public ItemShelf(Item item, int codeNumber) {
        this.item = item;
        this.codeNumber = codeNumber;
        this.soldOut = false;
    }

    public Item getItem() {
        return item;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return item.getItemType() + " price: " + item.getPrice() + " code: " + codeNumber + " soldOut: " + soldOut;
    }
}
