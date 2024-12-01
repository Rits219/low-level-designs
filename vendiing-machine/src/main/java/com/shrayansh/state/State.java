package com.shrayansh.state;

import com.shrayansh.model.Coin;
import com.shrayansh.model.VendingMachine;

public interface State {
    void clickOnInsertCoinButton(VendingMachine machine);

    void insertCoin(VendingMachine machine, Coin coin);

    void clickOnProductSelectButton(VendingMachine machine);

    void selectProduct(VendingMachine machine, int codeNumber);

    void clickOnCancelButton(VendingMachine machine);

    void returnChange(VendingMachine machine);
    void dispenseProduct(VendingMachine machine, int codeNumber);
}
