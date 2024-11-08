package com.shrayansh;

import java.util.List;

public class NearestToElevatorParkingSpotSpotStrategy implements ParkingSpotStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        System.out.println("returning nearest to elevator parking spot");
        return new ParkingSpot(1,10);
    }
}
