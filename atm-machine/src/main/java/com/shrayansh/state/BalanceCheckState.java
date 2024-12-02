package com.shrayansh.state;

import com.shrayansh.model.ATM;
import com.shrayansh.model.Card;

public class BalanceCheckState extends ATMState {

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your current balance is : " + card.getAccount().getBalance());
        exit(atm);
    }
}
