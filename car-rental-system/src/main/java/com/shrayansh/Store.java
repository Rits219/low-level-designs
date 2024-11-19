package com.shrayansh;

import com.shrayansh.product.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Store {
    private int storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private Location storeLocation;
    private List<Reservation> reservationList;

    public Store(List<Vehicle> vehicles, Location storeLocation) {
        this.storeId = Util.getRandomInt();
        this.vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
        this.storeLocation = storeLocation;
        this.reservationList = new ArrayList<>();
    }


    // crud operation to get/add/remove vehicles to the store.
    public void addVehicle(Vehicle vehicle) {
        this.vehicleInventoryManagement.addVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicleInventoryManagement.removeVehicle(vehicle);
    }

    public List<Vehicle> getVehicleList(){
        return this.vehicleInventoryManagement.getVehicleList();
    }

    // crud operation to add reservation to the reservation list.
    public void addReservation(Reservation reservation){
        this.reservationList.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        this.reservationList.remove(reservation);
    }

    public boolean hasActiveReservation(){
        return this.reservationList.stream()
                .anyMatch(reservation -> reservation.getReservationStatus() == ReservationStatus.SCHEDULED ||
                        reservation.getReservationStatus() == ReservationStatus.IN_PROGRESS);
    }

    public Location getStoreLocation() {
        return storeLocation;
    }
}
