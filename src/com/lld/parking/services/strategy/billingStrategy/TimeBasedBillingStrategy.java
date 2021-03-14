package com.lld.parking.services.strategy.billingStrategy;

import com.lld.parking.models.Booking;

public class TimeBasedBillingStrategy implements IBillingStrategy{
    @Override
    public double getBill(Booking booking) {
        // TODO generate bill based on time elapsed
        return 100.0;
    }
}
