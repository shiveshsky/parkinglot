package com.lld.parking.services.booking;

import com.lld.parking.beans.SpotBean;
import com.lld.parking.beans.VehicleBean;
import com.lld.parking.dao.bookings.BookingSingleton;
import com.lld.parking.models.Booking;
import com.lld.parking.models.Spot;
import com.lld.parking.services.spot.SpotService;
import com.lld.parking.services.strategy.billingStrategy.IBillingStrategy;

public class BookingSerivceImpl implements IBookingService{
    private static long cntr = 0;
    @Override
    public Booking addNewBooking(VehicleBean vehicleBean, SpotBean spotBean ) {
        SpotService spotService = new SpotService();

        Spot spot = spotService.getSpot(spotBean.getName());
        spotService.occupySpot(spotBean.getName(), vehicleBean);
        cntr++;
        return BookingSingleton.getBookingDAO().addBooking(cntr+"", spot);
    }

    @Override
    public String generateBill(Booking booking, IBillingStrategy billingStrategy) {
        return billingStrategy.getBill(booking) + "";
    }
}
