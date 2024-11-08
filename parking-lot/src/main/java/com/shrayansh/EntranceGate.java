package com.shrayansh;

import java.util.List;

public class EntranceGate {
    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate() {
        this.parkingSpotManagerFactory = new ParkingSpotManagerFactory();
    }

    //1. find parking spot
    public ParkingSpot findParkingSpot(Vehicle vehicle, List<ParkingSpot> list) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getType(), list);
        return parkingSpotManager.findParkingSpot(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(vehicle, parkingSpot);
    }

    public void bookParkingSpace(Vehicle v,ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(v);
    }

}
