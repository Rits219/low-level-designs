package com.shrayansh;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingSpotFactory parkingSpotFactory;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
        this.parkingSpotFactory = new ParkingSpotFactory();
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        ParkingSpotStrategy parkingSpotStrategy = parkingSpotFactory.getParkingSpotStrategy(vehicle.getType());
        return parkingSpotStrategy.findParkingSpot(parkingSpotList);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        if (!parkingSpot.getIsEmpty()) {
            parkingSpotList.remove(parkingSpot);
        } else {
            throw new RuntimeException("Can not remove parking spot as vehicle is parked here");
        }
    }

    public ParkingSpot getParkingSpot(int parkingId) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getId() == parkingId) {
                return parkingSpot;
            }
        }
        return null;
    }
}
