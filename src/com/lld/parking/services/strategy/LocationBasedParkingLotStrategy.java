package com.lld.parking.services.strategy;

import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;

public class LocationBasedParkingLotStrategy implements IParkinglotFetchStrategy{
    private String currentLocation;
    public LocationBasedParkingLotStrategy(String currentLocation){
        this.currentLocation = currentLocation;
    }
    @Override
    public ParkingLot getParkingLot(ArrayList<ParkingLot> parkingLotArrayList) {
        // TODO logic to return com.lld.parking lots based on current distance;
        return null;
    }
}
