package com.lld.parking.models;

import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private Spot spot;
    private final LocalDateTime intime = LocalDateTime.now();
    private LocalDateTime outtime;
    private double bill;
    private boolean payment_status;


    public LocalDateTime getIntime() {
        return intime;
    }

    public LocalDateTime getOuttime() {
        return outtime;
    }

    public void setOuttime(LocalDateTime outtime) {
        this.outtime = outtime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public boolean isPayment_status() {
        return payment_status;
    }

    public void setPayment_status(boolean payment_status) {
        this.payment_status = payment_status;
    }
}
