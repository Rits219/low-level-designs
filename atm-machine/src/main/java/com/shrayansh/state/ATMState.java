package com.shrayansh.state;

import com.shrayansh.model.ATM;
import com.shrayansh.model.Card;
import com.shrayansh.model.OperationType;

public abstract class ATMState {
    // defining the operations.
    public void insertCard(ATM atm,Card card) {
        System.out.println("You can't enter more than one card");
        return;
    }

    public void authenticatePin(ATM atm, Card card, int pinNumber) {
        System.out.println("not supported operation");
        return;
    }

    public void chooseOperation(ATM atm, OperationType operationType) {
        System.out.println("not supported operation");
        return;
    }

    public void withdrawCash(ATM atm, Card card, int price) {
        System.out.println("not supported operation");
        return;
    }

    public void exit(ATM atm) {
        System.out.println("Process exited");
        atm.setState(new IdleState());
    }

    public void checkBalance(ATM atm, Card card) {
        System.out.println("not supported operation");
    }
}
