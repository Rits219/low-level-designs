package com.shrayansh;

import com.shrayansh.model.Coin;
import com.shrayansh.model.Inventory;
import com.shrayansh.model.Item;
import com.shrayansh.model.ItemShelf;
import com.shrayansh.model.ItemType;
import com.shrayansh.model.VendingMachine;

public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(9);
        fillUpInventory(machine);
        machine.display();

        //user comes and click on insert coin button
        machine.clickOnInsertCoinButton();

        // then user adds a coin
        machine.insertCoin(Coin.DIME);
        machine.insertCoin(Coin.QUARTER);
        machine.insertCoin(Coin.NICKLE);

        //then user click on choose product button
        machine.clickOnProductSelectButton();

        //then user selects a product
        machine.selectProduct(1);

        machine.display();
    }

    private static void fillUpInventory(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        for (int i = 0; i < inventory.getNumberOfShelves(); i++) {
            Item item = null;
            if (i <= 2) {
                item = new Item(ItemType.COKE, 10);
            } else if (i <= 5) {
                item = new Item(ItemType.PEPSI, 20);
            } else {
                item = new Item(ItemType.JUICE, 30);
            }
            ItemShelf itemShelf = new ItemShelf(item, i);
            inventory.getItemShelfs()[i] = itemShelf;
        }
    }
}