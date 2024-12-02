package com.shrayansh;

import com.shrayansh.model.ATM;
import com.shrayansh.model.BankAccount;
import com.shrayansh.model.Card;
import com.shrayansh.model.OperationType;
import com.shrayansh.model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ATM atm = new ATM(26000, 10, 10, 10);
        User user1 = createUser1();
        User user2 = createUser2();


        //user comes into the atm and insert the card into atm
        atm.getState().insertCard(atm, user1.getCard());

        //user enters the pin
        atm.getState().authenticatePin(atm, user1.getCard(), 1234);

        //user selects the operation
        atm.getState().chooseOperation(atm, OperationType.WITHDRAW);

        //user withdraws the cash
        atm.getState().withdrawCash(atm, user1.getCard(), 25500);

        //User 2
        atm.getState().insertCard(atm, user2.getCard());
        atm.getState().authenticatePin(atm, user2.getCard(), 1235);
        atm.getState().chooseOperation(atm, OperationType.BALANCE_CHECK);
        atm.getState().checkBalance(atm, user1.getCard());
    }

    private static User createUser2() {
        BankAccount account = new BankAccount(30000);
        Card card = new Card(1235, 123456, account);
        return new User("Ranu", card);
    }

    private static User createUser1() {
        BankAccount account = new BankAccount(30000);
        Card card = new Card(1234, 123456, account);
        return new User("Ritesh", card);
    }
}