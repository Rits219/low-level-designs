package com.shrayansh.model;

import com.shrayansh.model.order.OrderStatus;
import com.shrayansh.model.payment.PaymentMode;

import java.util.Map;

public class Order {
    private int id;
    private User user;
    private Map<Integer, Integer> categoryIdVsCount;
    private Address deliveryAddress;
    private Invoice invoice;
    private Payment payment;
    private OrderStatus orderStatus;
    private Warehouse warehouse;

    public Order(User user, Map<Integer, Integer> categoryIdVsCount, Address deliveryAddress, Warehouse warehouse,
                 Invoice invoice, PaymentMode paymentMode, OrderStatus orderStatus) {
        this.id = Util.getRandomId();
        this.user = user;
        this.categoryIdVsCount = categoryIdVsCount;
        this.deliveryAddress = deliveryAddress;
        this.invoice = invoice;
        this.payment = new Payment(paymentMode);
        this.orderStatus = orderStatus;
        this.warehouse = warehouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<Integer, Integer> getCategoryIdVsCount() {
        return categoryIdVsCount;
    }

    public void setCategoryIdVsCount(Map<Integer, Integer> categoryIdVsCount) {
        this.categoryIdVsCount = categoryIdVsCount;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
