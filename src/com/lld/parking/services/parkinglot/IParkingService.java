package com.lld.parking.services.parkinglot;

import com.lld.parking.beans.FloorConfig;
import com.lld.parking.models.Floor;
import com.lld.parking.models.ParkingLot;
import com.lld.parking.models.Spot;
import com.lld.parking.services.strategy.IParkinglotFetchStrategy;

import java.util.ArrayList;

public interface IParkingService {
    public ParkingLot addParkingLot(String name, String location, int number_of_floors, ArrayList<FloorConfig> floorConfigs);
    public ParkingLot removeParkingLot(String name);
    public ParkingLot getParkingLot(IParkinglotFetchStrategy strategy);
    public ArrayList<Floor> getAllFloors(ParkingLot parkingLot);
    public ArrayList<Spot> getAllAvailableSpots(Floor floor);
}
