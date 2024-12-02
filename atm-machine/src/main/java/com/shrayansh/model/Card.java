package com.shrayansh.model;

public class Card {
    private int pinNumber;
    private int cardNumber;
    private BankAccount account;

    public Card(int pinNumber, int cardNumber, BankAccount account) {
        this.pinNumber = pinNumber;
        this.cardNumber = cardNumber;
        this.account = account;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public BankAccount getAccount() {
        return account;
    }
}
