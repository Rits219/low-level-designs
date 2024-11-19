package com.shrayansh;

public class Dice {
    private int numberOfDice;
    private int maxDiceValue;

    public Dice(int numberOfDice, int maxDiceValue) {
        this.numberOfDice = numberOfDice;
        this.maxDiceValue = maxDiceValue;
    }

    public int roll() {
        int result = 0;
        int count = numberOfDice;
        while (count > 0) {
            int diceValue = Util.getRandomNumber(1, maxDiceValue);
            result = result + diceValue;
            count--;
        }
        return result;
    }
}
