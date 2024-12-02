package com.shrayansh.state;

import com.shrayansh.model.ATM;
import com.shrayansh.model.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card inserted");
        atm.setState(new HasCardState());
    }
}
