package com.shrayansh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Product("Apple", 100);
        Product product2 = new Product("Banana", 50);

        Coupon coupon1 = new FixedCoupon(10);
        Coupon coupon2 = new NPercentOffCoupon(10);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        System.out.println("Total price without coupon: " + shoppingCart.getTotalPrice());

        shoppingCart.addCoupon(coupon1);
        System.out.println("Total price with fixed coupon: " + shoppingCart.getTotalPrice());

        shoppingCart.addCoupon(coupon2);
        System.out.println("Total price with fixed and percentage coupon: " + shoppingCart.getTotalPrice());
    }
}