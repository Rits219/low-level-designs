package com.shrayansh.state;

import com.shrayansh.model.ATM;
import com.shrayansh.model.OperationType;

public class SelectOperation extends ATMState {
    @Override
    public void chooseOperation(ATM atm, OperationType operationType) {
        if (OperationType.DEPOSIT == operationType) {
            System.out.println("this operation is not supported");
            exit(atm);
        } else if (OperationType.WITHDRAW == operationType) {
            atm.setState(new CashWithdrawlState());
        } else if (OperationType.BALANCE_CHECK == operationType) {
            atm.setState(new BalanceCheckState());
        } else {
            System.out.println("Invalid Operation");
            exit(atm);
        }
    }
}
