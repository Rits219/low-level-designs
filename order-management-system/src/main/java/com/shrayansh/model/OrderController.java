package com.shrayansh.model;

import com.shrayansh.model.order.OrderStatus;
import com.shrayansh.model.payment.PaymentMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderController {
    private List<Order> orderList;

    public OrderController() {
        this.orderList = new ArrayList<>();
    }

    public Order createOrder(Map<Integer, Integer> categoryIdVsCount, User user, Address deliveryAddress, Warehouse warehouse, PaymentMode paymentMode) {
        // validation if inventory exists.
        warehouse.validateInventory(categoryIdVsCount);
        // do the inventory reservation.
        warehouse.removeInventory(categoryIdVsCount);
        //clear the cart.
        user.getCart().clear();
        //create the order.
        Invoice invoice = calculateInvoice(categoryIdVsCount, warehouse.getInventory());
        Order order = new Order(user, categoryIdVsCount, deliveryAddress, warehouse, invoice, paymentMode, OrderStatus.PLACED);
        this.orderList.add(order);
        return order;
    }

    private Invoice calculateInvoice(Map<Integer, Integer> categoryIdVsCount, Inventory inventory) {
        return new Invoice(getTotalItemPrice(categoryIdVsCount, inventory), 0, 0);
    }

    private double getTotalItemPrice(Map<Integer, Integer> categoryIdVsCount, Inventory inventory) {
        double totalItemPrice = 0;
        for (Map.Entry<Integer, Integer> entry : categoryIdVsCount.entrySet()) {
            int categoryId = entry.getKey();
            int count = entry.getValue();
            // get the price of the product.

            // get the discount on the product.
            // calculate the total price.
            totalItemPrice += 0;
        }
        return totalItemPrice;
    }
}
