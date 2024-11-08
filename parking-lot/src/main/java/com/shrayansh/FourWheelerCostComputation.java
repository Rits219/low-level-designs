package com.shrayansh;

public class FourWheelerCostComputation extends CostComputation {
    @Override
    public double computeCost(Ticket ticket) {
        PricingStrategy pricingStrategy = new MinuteBasedPricingStrategy();
        return pricingStrategy.calculatePrice(ticket);
    }
}
