package com.shrayansh;

import java.util.List;

public class NPercentOffCoupon extends Coupon {
    private double discountPercentage;

    public NPercentOffCoupon(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double apply(List<Product> productList, double currentTotal) {
        double discount = currentTotal * discountPercentage / 100;
        return currentTotal - discount;
    }
}
