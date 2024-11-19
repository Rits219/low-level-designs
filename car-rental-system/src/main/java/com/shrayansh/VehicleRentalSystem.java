package com.shrayansh;

import com.shrayansh.product.Vehicle;

import java.util.List;

public class VehicleRentalSystem {
    private List<User> users;
    private List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;;
    }

    // crud operations on users.
    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        // add validation whether this user has any active reservation or not.
        if (user.hasActiveReservation()) {
            System.out.println("User %s has an active reservation, cannot be removed" + user.getName());
            return;
        }
        // remove the user from the system.
        this.users.remove(user);
    }

    // crud operation on stores.
    public void addStore(Store store) {
        this.stores.add(store);
    }

    public void removeStore(Store store) {
        if (store.hasActiveReservation()) {
            System.out.println("Store has an active reservation, cannot be removed");
            return;
        }
        this.stores.remove(store);
    }

    public List<Store> getStores(Location location) {
        return this.stores.stream()
                .filter(store -> store.getStoreLocation().equals(location))
                .toList();
    }

    // perform reservation
    public Reservation performReservation(User user, Store store, Vehicle vehicle, long bookingFrom, long bookingTill) {
        // create a reservation.
        Reservation reservation = new Reservation(user, vehicle, bookingFrom, bookingTill,ReservationType.DAILY);
        // add reservation to the user.
        user.addReservation(reservation);
        // add reservation to the store.
        store.addReservation(reservation);
        return reservation;
    }

    public Bill generateBill(Reservation reservation) {
        return new Bill(reservation);
    }

    public void payBill(Bill bill){
        // payment logic.
        Payment payment = new Payment(bill);
        payment.payBill();
    }
}
