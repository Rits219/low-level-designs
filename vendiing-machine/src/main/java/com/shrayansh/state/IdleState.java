package com.shrayansh.state;

import com.shrayansh.Util;
import com.shrayansh.model.Coin;
import com.shrayansh.model.VendingMachine;

public class IdleState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        machine.setState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        throw new UnsupportedOperationException("Please click on the insert coin button first");
    }

    @Override
    public void clickOnProductSelectButton(VendingMachine machine) {
        throw new UnsupportedOperationException("Please insert coin first");
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) {
        throw new UnsupportedOperationException("Please insert coin first");
    }

    @Override
    public void clickOnCancelButton(VendingMachine machine) {
        System.out.println("returned : " + Util.calculateTotal(machine) + " rupees ");
        machine.setState(new IdleState());
    }

    @Override
    public void returnChange(VendingMachine machine) {
        throw new UnsupportedOperationException("Please insert coin first");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int codeNumber) {
        throw new UnsupportedOperationException("Please insert coin first");
    }
}
