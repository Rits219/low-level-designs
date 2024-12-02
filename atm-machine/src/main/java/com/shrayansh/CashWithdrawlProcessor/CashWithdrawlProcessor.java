package com.shrayansh.CashWithdrawlProcessor;

import com.shrayansh.model.ATM;

public abstract class CashWithdrawlProcessor {
    private CashWithdrawlProcessor nextProcessor;

    public CashWithdrawlProcessor(CashWithdrawlProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public boolean cashWithdraw(ATM atm, int price) {
        if (price == 0) {
            return true;
        }

        if (nextProcessor != null) {
            return nextProcessor.cashWithdraw(atm, price);
        }

        return false;
    }
}
