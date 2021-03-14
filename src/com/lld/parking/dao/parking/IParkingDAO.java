package com.lld.parking.dao.parking;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.ParkingLot;

import java.util.HashMap;

public interface IParkingDAO {
    public ParkingLot add_parkinglot(String name, String location);
    public ParkingLot get_parkinglot(String name) throws ObjectNotFoundException;
    public ParkingLot delete_parkinglot(String name) throws ObjectNotFoundException;
    public HashMap<String, ParkingLot> getAllParkingLots();
}
