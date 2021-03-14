package com.lld.parking.dao.bookings;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Booking;
import com.lld.parking.models.Spot;

public interface IBookingDAO {
    public Booking addBooking(String bookingId, Spot spot);
    public Booking getBooking(String bookingId) throws ObjectNotFoundException;
    public Booking deleteBooking(String bookingId) throws ObjectNotFoundException;
}
