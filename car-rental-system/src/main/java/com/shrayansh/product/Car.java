package com.shrayansh.product;

public class Car extends Vehicle{

    public Car(VehicleType type, int chassisNumber, String vehicleName, double dailyRentalCharge,
               double hourlyRentalCharge, double weeklyRentalCharge) {
        super(type, chassisNumber, vehicleName, dailyRentalCharge, hourlyRentalCharge, weeklyRentalCharge);
    }
}
