package com.lld.parking.dao.bookings;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Booking;
import com.lld.parking.models.Spot;

import java.util.HashMap;

public class BookingDAOImpl implements IBookingDAO{
    HashMap<String, Booking> bookingHashMap;
    public BookingDAOImpl(){
        bookingHashMap = new HashMap<>();
    }
    @Override
    public Booking addBooking(String bookingId, Spot spot) {
        Booking booking = new Booking();
        booking.setBookingId(bookingId);
        booking.setSpot(spot);

        bookingHashMap.put(bookingId, booking);
        return booking;
    }

    @Override
    public Booking getBooking(String bookingId) throws ObjectNotFoundException {
        if (bookingHashMap.containsKey(bookingId)){
            return bookingHashMap.get(bookingId);
        }
        throw new ObjectNotFoundException("Booking not found exception");
    }

    @Override
    public Booking deleteBooking(String bookingId) throws ObjectNotFoundException {
        if (bookingHashMap.containsKey(bookingId)){
            return bookingHashMap.remove(bookingId);
        }
        throw new ObjectNotFoundException("Booking not found exception");
    }
}
