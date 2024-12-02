package com.shrayansh.CashWithdrawlProcessor;

import com.shrayansh.model.ATM;

public class FiveHundredRsWithdrawalProcessor extends CashWithdrawlProcessor{
    private static final int FIVE_HUNDRED = 500;
    public FiveHundredRsWithdrawalProcessor(CashWithdrawlProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean cashWithdraw(ATM atm, int price) {
        System.out.println("Dispensing 500 Rs notes");
        int usableNotes = price / FIVE_HUNDRED;
        int availableNotes = atm.getNoOfFiveHundredsRsNotes();
        int remainingPrice = price;
        if (availableNotes >= usableNotes) {
            remainingPrice = remainingPrice - usableNotes * FIVE_HUNDRED;
            System.out.println("Dispensing " + usableNotes + " 500 Rs notes");
            availableNotes = availableNotes - usableNotes;
        } else {
            remainingPrice = remainingPrice - availableNotes * FIVE_HUNDRED;
            System.out.println("Dispensing " + availableNotes + " 500 Rs notes");
            availableNotes = 0;
        }

        if (super.cashWithdraw(atm, remainingPrice)) {
            atm.setNoOfFiveHundredsRsNotes(availableNotes);
            return true;
        } else {
            return false;
        }
    }
}
