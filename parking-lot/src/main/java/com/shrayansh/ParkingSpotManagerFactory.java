package com.shrayansh;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        return switch (vehicleType) {
            case Two_Wheeler -> new TwoWheelerParkingSpotManager(spots);
            case Four_Wheeler -> new FourWheelerParkingSpotManager(spots);
        };
    }
}
