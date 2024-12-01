package com.shrayansh.state;

import com.shrayansh.Util;
import com.shrayansh.model.Coin;
import com.shrayansh.model.VendingMachine;

public class HasMoneyState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        machine.addCoin(coin);
        System.out.println("inserted coin into machine " + coin);
    }

    @Override
    public void clickOnProductSelectButton(VendingMachine machine) {
        machine.setState(new SelectionState());
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void clickOnCancelButton(VendingMachine machine) {
        System.out.println("returned : " + Util.calculateTotal(machine) + " rupees ");
        machine.setState(new IdleState());
    }

    @Override
    public void returnChange(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int codeNumber) {
        throw new UnsupportedOperationException("not supported");
    }
}
