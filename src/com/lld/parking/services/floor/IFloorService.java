package com.lld.parking.services.floor;

import com.lld.parking.models.Floor;
import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;

public interface IFloorService {
    public Floor addFloor(String name, ParkingLot parkingLot, int capacity);
    public Floor removeFloor(String name);
    public Floor getFloor(String name);
    public ArrayList<Floor> getAllFloors(ParkingLot parkingLot);
}
