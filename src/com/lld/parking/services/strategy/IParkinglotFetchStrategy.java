package com.lld.parking.services.strategy;

import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;

public interface IParkinglotFetchStrategy {
    public ParkingLot getParkingLot(ArrayList<ParkingLot> parkingLotArrayList);
}
