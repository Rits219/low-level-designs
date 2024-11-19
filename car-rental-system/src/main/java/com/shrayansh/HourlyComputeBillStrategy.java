package com.shrayansh;

public class HourlyComputeBillStrategy implements ComputeBillStrategy{
    @Override
    public double computeBill(Reservation reservation) {
        long diffInHour = calculateDiffInHour(reservation.getBookingFrom(),reservation.getBookingTill());
        return diffInHour * reservation.getVehicle().getHourlyRentalCharge();
    }

    private long calculateDiffInHour(long bookingFrom, long bookingTill) {
        return 24;
    }
}
