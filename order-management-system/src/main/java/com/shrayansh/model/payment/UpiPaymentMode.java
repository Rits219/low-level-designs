package com.shrayansh.model.payment;

public class UpiPaymentMode implements PaymentMode {
    @Override
    public boolean makePayment() {
        System.out.println("Making payment using UPI");
        return true;
    }
}
