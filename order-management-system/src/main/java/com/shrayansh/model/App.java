package com.shrayansh.model;

import com.shrayansh.UserController;
import com.shrayansh.model.payment.PaymentMode;
import com.shrayansh.model.warehouseSelection.NearestWarehouseSelectionStrategy;

import java.util.Map;

public class App {
    private WarehouseController warehouseController;
    private UserController userController;
    private OrderController orderController;

    public App() {
        this.orderController = new OrderController();
        this.userController = new UserController();
        this.warehouseController = new WarehouseController();
    }

    public void addUser(User user) {
        userController.addUser(user);
    }

    public void removeUser(User user) {
        userController.removeUser(user);
    }

    public Warehouse getWarehouse(Address address, NearestWarehouseSelectionStrategy nearestWarehouseSelectionStrategy) {
        return warehouseController.selectWarehouse(address, nearestWarehouseSelectionStrategy);
    }

    public Order createOrder(Map<Integer, Integer> categoryIdVsCount, User user, Address deliveryAddress, PaymentMode paymentMode, Warehouse warehouse) {
        return orderController.createOrder(categoryIdVsCount, user, deliveryAddress, warehouse, paymentMode);
    }

    public void addWarehouse(Warehouse warehouse) {
        this.warehouseController.addWarehouse(warehouse);
    }
}
