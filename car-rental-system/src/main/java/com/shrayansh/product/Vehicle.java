package com.shrayansh.product;

import com.shrayansh.Util;

import java.util.UUID;

public abstract class Vehicle {
    private int vehicleId;
    private int chassisNumber;
    private VehicleType vehicleType;
    private String vehicleName;
    private double dailyRentalCharge;
    private double hourlyRentalCharge;
    private double weeklyRentalCharge;
    private VehicleStatus status;

    public Vehicle(VehicleType type, int chassisNumber, String vehicleName, double dailyRentalCharge,
                   double hourlyRentalCharge, double weeklyRentalCharge) {
        this.vehicleId = Util.getRandomInt();
        this.chassisNumber = chassisNumber;
        this.vehicleType = type;
        this.vehicleName = vehicleName;
        this.dailyRentalCharge = dailyRentalCharge;
        this.weeklyRentalCharge = weeklyRentalCharge;
        this.hourlyRentalCharge = hourlyRentalCharge;
        this.status = VehicleStatus.AVAILABLE;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public double getDailyRentalCharge() {
        return dailyRentalCharge;
    }

    public double getHourlyRentalCharge() {
        return hourlyRentalCharge;
    }

    public double getWeeklyRentalCharge() {
        return weeklyRentalCharge;
    }
}
