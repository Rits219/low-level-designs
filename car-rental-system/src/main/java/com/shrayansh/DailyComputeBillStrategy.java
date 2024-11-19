package com.shrayansh;

public class DailyComputeBillStrategy implements ComputeBillStrategy{

    @Override
    public double computeBill(Reservation reservation) {
        int dateUsed = calculateDiff(reservation.getBookingTill(), reservation.getBookingFrom());
        return dateUsed * reservation.getVehicle().getDailyRentalCharge();
    }

    private int calculateDiff(long bookingTill, long bookingFrom) {
        return 5;
    }
}
