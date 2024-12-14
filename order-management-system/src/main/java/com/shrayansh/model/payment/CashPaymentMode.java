package com.shrayansh.model.payment;

public class CashPaymentMode implements PaymentMode{
    @Override
    public boolean makePayment() {
        System.out.println("cash payment");
        return true;
    }
}
