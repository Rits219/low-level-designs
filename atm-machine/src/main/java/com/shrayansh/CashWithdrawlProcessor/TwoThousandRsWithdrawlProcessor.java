package com.shrayansh.CashWithdrawlProcessor;

import com.shrayansh.model.ATM;

public class TwoThousandRsWithdrawlProcessor extends CashWithdrawlProcessor {
    private static final int TWO_THOUSAND = 2000;
    public TwoThousandRsWithdrawlProcessor(CashWithdrawlProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean cashWithdraw(ATM atm, int price) {
        System.out.println("Dispensing 2000 Rs notes");
        int usableNotes = price / TWO_THOUSAND;
        int availableNotes = atm.getNoOfTwoThousandsRsNotes();
        int remainingPrice = price;
        if (availableNotes >= usableNotes) {
            remainingPrice = remainingPrice - usableNotes * TWO_THOUSAND;
            System.out.println("Dispensing " + usableNotes + " 2000 Rs notes");
            availableNotes = availableNotes - usableNotes;
        } else {
            remainingPrice = remainingPrice - availableNotes * TWO_THOUSAND;
            System.out.println("Dispensing " + availableNotes + " 2000 Rs notes");
            availableNotes = 0;
        }

        if (super.cashWithdraw(atm, remainingPrice)) {
            atm.setNoOfTwoThousandsRsNotes(availableNotes);
            return true;
        } else {
            return false;
        }
    }
}
