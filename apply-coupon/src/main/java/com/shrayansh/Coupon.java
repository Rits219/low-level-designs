package com.shrayansh;

import java.util.List;

public abstract class Coupon {
    public abstract double apply(List<Product> productList, double currentTotal);
}
