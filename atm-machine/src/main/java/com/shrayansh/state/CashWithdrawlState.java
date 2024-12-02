package com.shrayansh.state;

import com.shrayansh.CashWithdrawlProcessor.CashWithdrawlProcessor;
import com.shrayansh.CashWithdrawlProcessor.FiveHundredRsWithdrawalProcessor;
import com.shrayansh.CashWithdrawlProcessor.HundredRsNotesCashWithdrawalProcessor;
import com.shrayansh.CashWithdrawlProcessor.TwoThousandRsWithdrawlProcessor;
import com.shrayansh.model.ATM;
import com.shrayansh.model.Card;

public class CashWithdrawlState extends ATMState {
    @Override
    public void withdrawCash(ATM atm, Card card, int price) {
        if (price > atm.getBalance()) {
            System.out.println("Insufficient Balance in ATM");
            exit(atm);
            return;
        }

        if (card.getAccount().getBalance() < price) {
            System.out.println("Insufficient Balance in Account");
            exit(atm);
            return;
        }

        // implement withdraw cash method based on the scope
        System.out.println("Withdrawing cash");
        CashWithdrawlProcessor cashWithdrawlProcessor = new TwoThousandRsWithdrawlProcessor(
                new FiveHundredRsWithdrawalProcessor(
                        new HundredRsNotesCashWithdrawalProcessor(null)));
        if (cashWithdrawlProcessor.cashWithdraw(atm, price)) {
            atm.setBalance(atm.getBalance() - price);
        } else {
            System.out.println("Unable to withdraw cash");
        }
        exit(atm);
    }
}
