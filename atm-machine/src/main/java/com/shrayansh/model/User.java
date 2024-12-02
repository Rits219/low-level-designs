package com.shrayansh.model;

public class User {
    private String name;
    private Card card;

    public User(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
