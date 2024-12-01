package com.shrayansh.state;

import com.shrayansh.Util;
import com.shrayansh.model.Coin;
import com.shrayansh.model.Item;
import com.shrayansh.model.ItemShelf;
import com.shrayansh.model.VendingMachine;

public class SelectionState implements State {
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
        // get the item from the code number
        ItemShelf itemShelf = machine.getInventory().getItemShelfByCode(codeNumber);

        if (itemShelf == null) {
            System.out.println("Invalid code number");
            return;
        }

        System.out.println(itemShelf);

        if (itemShelf.isSoldOut()) {
            System.out.println("Product is sold out");
            return;
        }
        Item item = itemShelf.getItem();
        // check if product can be selected.
        double insertedPrice = Util.calculateTotal(machine);
        double itemPrice = item.getPrice();

        if (insertedPrice < itemPrice) {
            System.out.println("Please insert more coins");
            return;
        }

        // if yes then dispense the product
        machine.setState(new DispenseState());
        State state = machine.getState();
        state.dispenseProduct(machine, codeNumber);

        // returned the change
        insertedPrice = insertedPrice - itemPrice;
        System.out.println("returned change of " + insertedPrice);

    }

    @Override
    public void clickOnCancelButton(VendingMachine machine) {
        double price = Util.calculateTotal(machine);
        System.out.println("returning change of " + price);
        machine.setState(new IdleState());
    }

    @Override
    public void returnChange(VendingMachine machine) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine, int codeNumber) {

    }
}
