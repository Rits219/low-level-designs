package com.shrayansh;

import com.shrayansh.model.Coin;
import com.shrayansh.model.VendingMachine;

public class Util {
    public static double calculateTotal(VendingMachine machine){
        return machine.getCoins().stream()
                .mapToDouble(Coin::getValue)
                .sum();
    }
}
