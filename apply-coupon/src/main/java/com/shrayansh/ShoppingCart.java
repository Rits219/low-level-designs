package com.shrayansh;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;
    private List<Coupon> couponList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
        this.couponList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void addCoupon(Coupon coupon) {
        couponList.add(coupon);
    }

    public double getTotalPrice() {
        double totalPrice = productList.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        for (Coupon coupon : couponList) {
            totalPrice = coupon.apply(productList, totalPrice);
        }
        return totalPrice;
    }
}
