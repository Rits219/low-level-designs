package com.shrayansh;

public class HourlyBasedStrategy extends PricingStrategy {
    @Override
    public double calculatePrice(Ticket ticket) {
        System.out.println("Hourly based pricing strategy");
        long hours = (System.currentTimeMillis() - ticket.getEntranceTime()) / 60000 * 60;
        return ticket.getParkingSpot().getPrice() * hours;
    }
}
