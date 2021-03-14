package com.lld.parking.services.booking;

import com.lld.parking.beans.SpotBean;
import com.lld.parking.beans.VehicleBean;
import com.lld.parking.models.Booking;
import com.lld.parking.services.strategy.billingStrategy.IBillingStrategy;

public interface IBookingService {
    public Booking addNewBooking(VehicleBean vehicleBean, SpotBean spotBean);
    public String generateBill(Booking booking, IBillingStrategy billingStrategy);

}
