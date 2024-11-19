package com.shrayansh;

import com.shrayansh.product.Bike;
import com.shrayansh.product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(Util.getRandomInt());

        Location bengaluruLocation = new Location("Bengaluru", "Bengaluru", "Karnataka", "India", 560035);
        // create stores.
        Store store1 = new Store(new ArrayList<>(), bengaluruLocation);

        // create vehicles
        Vehicle vehicle1 = new Bike(1234, "splendar", 100, 10, 500);
        Vehicle vehicle2 = new Bike(1235, "pulsar", 200, 20, 1000);

        // add vehicles to store.
        store1.addVehicle(vehicle1);
        store1.addVehicle(vehicle2);

        // create user
        User user1 = new User("Ritesh", "drivingLicense1");

        //add users and stores to the car rental system
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(List.of(user1), List.of(store1));

        //search-> user comes and will get the stores which are present in a particular location.
        List<Store> stores = vehicleRentalSystem.getStores(bengaluruLocation);
        // after tha user selects a store and then he will see the list of vehicles present in the store.
        List<Vehicle> vehicles = stores.get(0).getVehicleList();

        // user selects a vehicle and books it.
        Reservation reservation = vehicleRentalSystem.performReservation(user1, stores.get(0), vehicles.get(0), System.currentTimeMillis(), System.currentTimeMillis() + 100000);

        // Generate Bill.
        Bill bill = vehicleRentalSystem.generateBill(reservation);

        // user make the payment
        vehicleRentalSystem.payBill(bill);

    }
}