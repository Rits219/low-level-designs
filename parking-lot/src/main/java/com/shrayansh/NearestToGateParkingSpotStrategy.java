package com.shrayansh;

import java.util.List;

public class NearestToGateParkingSpotStrategy implements ParkingSpotStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        System.out.println("call came for finding nearest to gate parking spot");
        return new ParkingSpot(1, 10);
    }
}
