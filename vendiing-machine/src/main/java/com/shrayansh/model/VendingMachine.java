package com.shrayansh.model;

import com.shrayansh.state.IdleState;
import com.shrayansh.state.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private List<Coin> coins;
    private double price;

    public VendingMachine(int numberOfShelves) {
        this.state = new IdleState();
        this.inventory = new Inventory(numberOfShelves);
        this.coins = new ArrayList<>();
        this.price = 0;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public void addCoin(Coin coin) {
        coins.add(coin);
        price = price + coin.getValue();
    }

    public void display() {
        ItemShelf[] itemShelfList = inventory.getItemShelfs();
        Arrays.stream(itemShelfList).forEach(itemShelf -> {
            Item item = itemShelf.getItem();
            System.out.println(item.getItemType() + " price: " + item.getPrice() + " code: " + itemShelf.getCodeNumber());
        });
    }


    public void clickOnInsertCoinButton() {
        this.state.clickOnInsertCoinButton(this);
    }

    public void insertCoin(Coin coin) {
        this.state.insertCoin(this, coin);
    }

    public void clickOnProductSelectButton() {
        this.state.clickOnProductSelectButton(this);
    }

    public void selectProduct(int i) {
        this.state.selectProduct(this, i);
    }
}
