package com.shrayansh;

import java.util.UUID;

public class Ticket {
    private int ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private long entranceTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entranceTime = System.currentTimeMillis();
        this.ticketId = Integer.parseInt(UUID.randomUUID().toString());
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntranceTime() {
        return entranceTime;
    }
}
