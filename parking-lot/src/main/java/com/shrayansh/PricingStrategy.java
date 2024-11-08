package com.shrayansh;

public class PricingStrategy {
    public double calculatePrice(Ticket ticket){
        return ticket.getParkingSpot().getPrice();
    }
}
