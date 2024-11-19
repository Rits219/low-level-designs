package com.shrayansh;

import java.util.UUID;

public class Bill {
    private int id;
    private Reservation reservation;
    private double totalCost;
    private boolean isPaid;
    private ComputeBillFactory computeBillFactory;

    public Bill(Reservation reservation) {
        this.id = Util.getRandomInt();
        this.reservation = reservation;
        this.computeBillFactory = new ComputeBillFactory();
        this.totalCost = computeBill();
        this.isPaid = false;
    }

    public int getId() {
        return id;
    }

    public double computeBill() {
        ComputeBillStrategy computeBillStrategy = computeBillFactory.getComputeBillStrategy(reservation.getReservationType());
        return computeBillStrategy.computeBill(reservation);
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
