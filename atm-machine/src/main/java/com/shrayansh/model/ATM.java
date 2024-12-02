package com.shrayansh.model;

import com.shrayansh.state.ATMState;
import com.shrayansh.state.IdleState;

public class ATM {
    private ATMState state;
    private double balance;
    private int noOfHundredRsNotes;
    private int noOfFiveHundredsRsNotes;
    private int noOfTwoThousandsRsNotes;

    public ATM(double balance, int noOfHundredRsNotes, int noOfFiveHundredsRsNotes, int noOfTwoThousandsRsNotes) {
        this.state = new IdleState();
        this.balance = balance;
        this.noOfHundredRsNotes = noOfHundredRsNotes;
        this.noOfFiveHundredsRsNotes = noOfFiveHundredsRsNotes;
        this.noOfTwoThousandsRsNotes = noOfTwoThousandsRsNotes;
    }

    public ATMState getState() {
        return state;
    }

    public int getNoOfFiveHundredsRsNotes() {
        return noOfFiveHundredsRsNotes;
    }

    public int getNoOfHundredRsNotes() {
        return noOfHundredRsNotes;
    }

    public int getNoOfTwoThousandsRsNotes() {
        return noOfTwoThousandsRsNotes;
    }

    public void setNoOfFiveHundredsRsNotes(int noOfFiveHundredsRsNotes) {
        this.noOfFiveHundredsRsNotes = noOfFiveHundredsRsNotes;
    }

    public void setNoOfHundredRsNotes(int noOfHundredRsNotes) {
        this.noOfHundredRsNotes = noOfHundredRsNotes;
    }

    public void setNoOfTwoThousandsRsNotes(int noOfTwoThousandsRsNotes) {
        this.noOfTwoThousandsRsNotes = noOfTwoThousandsRsNotes;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }
}
