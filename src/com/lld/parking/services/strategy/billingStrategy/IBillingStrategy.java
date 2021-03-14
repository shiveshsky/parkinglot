package com.lld.parking.services.strategy.billingStrategy;

import com.lld.parking.models.Booking;

public interface IBillingStrategy {
    public double getBill(Booking booking);
}
