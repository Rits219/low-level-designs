package com.shrayansh;

public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private double price;

    public ParkingSpot(int id, double price) {
        this.isEmpty = true;
        this.vehicle = null;
        this.id = id;
        this.price = price;
    }

    //park vehicle
    public void parkVehicle(Vehicle v) {
        this.isEmpty = false;
        this.vehicle = v;
    }

    //remove parking space.
    public void removeVehicle() {
        this.isEmpty = true;
        this.vehicle = null;
    }

    public double getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean getIsEmpty() {
        return this.isEmpty;
    }

    public int getId() {
        return id;
    }
}
