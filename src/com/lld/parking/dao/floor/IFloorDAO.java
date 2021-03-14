package com.lld.parking.dao.floor;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;

public interface IFloorDAO {
    public Floor addFloor(String name, ParkingLot parkingLot, int capacity);
    public Floor getFloor(String name) throws ObjectNotFoundException;
    public Floor deleteFloor(String name) throws ObjectNotFoundException;
    public ArrayList<Floor> getAllFloors(ParkingLot parkingLot);
}
