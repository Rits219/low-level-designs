package com.shrayansh;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private int userId;
    private String name;
    private String drivingLicense;
    private List<Reservation> reservationList;

    public User(String name, String drivingLicense) {
        this.userId = Util.getRandomInt();
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.reservationList = new ArrayList<>();
    }

    public void addReservation(Reservation reservation){
        this.reservationList.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        this.reservationList.remove(reservation);
    }

    public boolean hasActiveReservation(){
        return !this.reservationList.isEmpty();
    }

    public String getName() {
        return name;
    }
}
