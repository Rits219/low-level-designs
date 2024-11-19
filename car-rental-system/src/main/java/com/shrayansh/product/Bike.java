package com.shrayansh.product;

public class Bike extends Vehicle {
    public Bike(int chassisNumber, String vehicleName, double dailyRentalCharge,
                double hourlyRentalCharge, double weeklyRentalCharge) {
        super(VehicleType.BIKE, chassisNumber, vehicleName, dailyRentalCharge, hourlyRentalCharge, weeklyRentalCharge);
    }
}
