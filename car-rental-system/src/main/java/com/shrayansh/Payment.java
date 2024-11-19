package com.shrayansh;

public class Payment {
    private int paymentId;
    private Bill bill;

    public Payment(Bill bill) {
        this.paymentId = Util.getRandomInt();
        this.bill = bill;
    }

    public void payBill() {
        // update bill isPaid field.
        this.bill.setPaid(true);
    }
}
