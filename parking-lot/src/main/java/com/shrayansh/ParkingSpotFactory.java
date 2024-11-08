package com.shrayansh;

public class ParkingSpotFactory {
    public ParkingSpotStrategy getParkingSpotStrategy(VehicleType vehicleType) {
        return switch (vehicleType) {
            case Two_Wheeler -> new NearestToElevatorParkingSpotSpotStrategy();
            case Four_Wheeler -> new NearestToGateParkingSpotStrategy();
        };
    }
}
