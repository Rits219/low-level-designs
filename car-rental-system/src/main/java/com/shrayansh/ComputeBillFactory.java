package com.shrayansh;

import com.shrayansh.product.VehicleType;

public class ComputeBillFactory {
    public ComputeBillStrategy getComputeBillStrategy(ReservationType reservationType) {
        return switch (reservationType) {
            case HOURLY -> new HourlyComputeBillStrategy();
            case DAILY -> new DailyComputeBillStrategy();
        };
    }
}
