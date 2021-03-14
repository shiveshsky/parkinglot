package com.lld.parking.services.strategy;

import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;

public class PriceBasedParkingLotStrategy implements IParkinglotFetchStrategy{
    private double expected_price;
    public PriceBasedParkingLotStrategy(double expected_price){
        this.expected_price = expected_price;
    }

    @Override
    public ParkingLot getParkingLot(ArrayList<ParkingLot> parkingLotArrayList) {
        // TODO sort based on price.
        return null;
    }
}
