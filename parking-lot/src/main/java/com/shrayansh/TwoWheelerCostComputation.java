package com.shrayansh;

public class TwoWheelerCostComputation extends CostComputation {
    @Override
    public double computeCost(Ticket ticket) {
        PricingStrategy pricingStrategy = new HourlyBasedStrategy();
        return pricingStrategy.calculatePrice(ticket);
    }
}
