package com.shrayansh.state;

import com.shrayansh.model.ATM;
import com.shrayansh.model.Card;

public class HasCardState extends ATMState {

    @Override
    public void authenticatePin(ATM atm, Card card, int pinNumber) {
        if (card.getPinNumber() == pinNumber) {
            System.out.println("Pin Authenticated");
            atm.setState(new SelectOperation());
        } else {
            System.out.println("Invalid Pin");
            exit(atm);
        }
    }
}
