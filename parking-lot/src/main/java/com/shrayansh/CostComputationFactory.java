package com.shrayansh;

public class CostComputationFactory {
    public CostComputation getCostComputation(VehicleType vehicleType) {
        return switch (vehicleType) {
            case Two_Wheeler -> new TwoWheelerCostComputation();
            case Four_Wheeler -> new FourWheelerCostComputation();
        };
    }
}
