package com.shrayansh;

public class ExitGate {
    // remove vehicle
    // calculate the price.
    Ticket ticket;
    CostComputationFactory costComputationFactory;

    public ExitGate(Ticket ticket) {
        costComputationFactory = new CostComputationFactory();
        this.ticket = ticket;
    }


    public void removeVehicle(Vehicle vehicle) {
        System.out.println("Vehicle removed");
        ticket.getParkingSpot().removeVehicle();
    }

    public void calculateCharge(Ticket ticket) {
        CostComputation costComputation = costComputationFactory.getCostComputation(ticket.getParkingSpot().getVehicle().getType());
        double price = costComputation.computeCost(ticket);
        System.out.println("Price to be paid: " + price);
    }
}
