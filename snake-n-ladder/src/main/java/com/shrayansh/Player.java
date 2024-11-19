package com.shrayansh;

public class Player {
    private int id;
    private String name;
    private int currentPosition;

    public Player(String name) {
        this.id = Util.getRandomInt();
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
