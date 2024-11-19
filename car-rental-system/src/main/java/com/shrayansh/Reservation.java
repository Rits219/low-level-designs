package com.shrayansh;

import com.shrayansh.product.Vehicle;

import java.util.UUID;

public class Reservation {
    private int id;
    private User user;
    private Vehicle vehicle;
    private long bookingTime;
    private long bookingFrom;
    private long bookingTill;
    private ReservationStatus reservationStatus;
    private ReservationType reservationType;

    public Reservation(User user, Vehicle vehicle, long bookingFrom, long bookingTill, ReservationType reservationType) {
        this.id = Util.getRandomInt();
        this.user = user;
        this.vehicle = vehicle;
        this.bookingTime = System.currentTimeMillis();
        this.bookingFrom = bookingFrom;
        this.bookingTill = bookingTill;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus() {
        return this.reservationStatus;
    }

    public long getBookingTill() {
        return this.bookingTill;
    }

    public long getBookingFrom(){
        return this.bookingFrom;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    // create, read, update, delete operations.
}
