package com.shrayansh.model;

import com.shrayansh.model.payment.PaymentMode;

public class Payment {
    private PaymentMode paymentMode;

    public Payment(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean makePayment() {
        return this.paymentMode.makePayment();
    }
}
