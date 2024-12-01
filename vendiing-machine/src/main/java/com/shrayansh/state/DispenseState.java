package com.shrayansh.state;

import com.shrayansh.model.Coin;
import com.shrayansh.model.ItemShelf;
import com.shrayansh.model.VendingMachine;

public class DispenseState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void clickOnProductSelectButton(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void clickOnCancelButton(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void returnChange(VendingMachine machine) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int codeNumber) {
        System.out.println("dispensing product with code number " + codeNumber);
        ItemShelf itemShelf = machine.getInventory().getItemShelfByCode(codeNumber);
        itemShelf.setSoldOut(true);
        machine.setState(new IdleState());
    }
}
