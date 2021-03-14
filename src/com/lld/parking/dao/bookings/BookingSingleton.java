package com.lld.parking.dao.bookings;

public class BookingSingleton {
    private static BookingDAOImpl bookingDAO;
    private BookingSingleton(){
        bookingDAO = new BookingDAOImpl();
    }
    public static BookingDAOImpl getBookingDAO(){
        if (bookingDAO == null){
            new BookingSingleton();
        }
        return bookingDAO;
    }
}
