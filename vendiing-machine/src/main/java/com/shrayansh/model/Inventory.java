package com.shrayansh.model;

public class Inventory {
    private ItemShelf[] itemShelfs;
    private int numberOfShelves;

    public Inventory(int numberOfShelves) {
        this.itemShelfs = new ItemShelf[numberOfShelves];
        for (int i = 0; i < numberOfShelves; i++) {
            itemShelfs[i] = new ItemShelf(null, i + 1);
        }
        this.numberOfShelves = numberOfShelves;
    }

    public ItemShelf[] getItemShelfs() {
        return itemShelfs;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public ItemShelf getItemShelfByCode(int code) {
        for (int i = 0; i < numberOfShelves; i++) {
            if (itemShelfs[i].getCodeNumber() == code) {
                return itemShelfs[i];
            }
        }
        return null;
    }
}
