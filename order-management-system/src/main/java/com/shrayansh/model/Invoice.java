package com.shrayansh.model;

public class Invoice {
    private int id;
    private double totalItemPrice;
    private double totalTax;
    private double totalPayableAmount;

    public Invoice(double totalItemPrice, double totalTax, double totalPayableAmount) {
        this.id = Util.getRandomId();
        this.totalItemPrice = totalItemPrice;
        this.totalTax = totalTax;
        this.totalPayableAmount = totalPayableAmount;
    }
}
