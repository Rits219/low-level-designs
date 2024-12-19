package com.shrayansh;

import java.util.List;

public class FixedCoupon extends Coupon {
    private double fixedDiscount;

    public FixedCoupon(double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    @Override
    public double apply(List<Product> productList, double currentTotal) {
        return currentTotal - fixedDiscount;
    }
}
