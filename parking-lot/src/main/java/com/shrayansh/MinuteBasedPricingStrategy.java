package com.shrayansh;

public class MinuteBasedPricingStrategy extends PricingStrategy{
    @Override
    public double calculatePrice(Ticket ticket) {
        long minutes = (System.currentTimeMillis() - ticket.getEntranceTime())/60000;
        return ticket.getParkingSpot().getPrice() * minutes;
    }
}
