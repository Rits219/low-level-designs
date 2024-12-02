package com.shrayansh.CashWithdrawlProcessor;

import com.shrayansh.model.ATM;

public class HundredRsNotesCashWithdrawalProcessor extends CashWithdrawlProcessor{
    private static final int HUNDRED = 100;
    public HundredRsNotesCashWithdrawalProcessor(CashWithdrawlProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean cashWithdraw(ATM atm, int price) {
        System.out.println("Dispensing 100 Rs notes");
        int usableNotes = price / HUNDRED;
        int availableNotes = atm.getNoOfHundredRsNotes();
        int remainingPrice = price;
        if (availableNotes >= usableNotes) {
            remainingPrice = remainingPrice - usableNotes * HUNDRED;
            System.out.println("Dispensing " + usableNotes + " 100 Rs notes");
            availableNotes = availableNotes - usableNotes;
        } else {
            remainingPrice = remainingPrice - availableNotes * HUNDRED;
            System.out.println("Dispensing " + availableNotes + " 100 Rs notes");
            availableNotes = 0;
        }

        if (super.cashWithdraw(atm, remainingPrice)) {
            atm.setNoOfHundredRsNotes(availableNotes);
            return true;
        } else {
            return false;
        }
    }
}
