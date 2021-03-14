package com.lld.parking.dao.floor;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FloorDAO implements IFloorDAO{
    private HashMap<String, Floor> floorHashMap;

    public FloorDAO(){
        floorHashMap = new HashMap<>();
    }
    @Override
    public Floor addFloor(String name, ParkingLot parkingLot, int capacity) {
        Floor floor = new Floor();
        floor.setName(name);
        floor.setParkingLot(parkingLot);
        floor.setCapacity(capacity);
        floorHashMap.put(name, floor);
        return floor;
    }

    @Override
    public Floor getFloor(String name) throws ObjectNotFoundException {
        if (floorHashMap.containsKey(name)){
            return floorHashMap.get(name);
        }
        else {
            throw new ObjectNotFoundException("Floor with the given name does not exists");
        }
    }

    @Override
    public Floor deleteFloor(String name) throws ObjectNotFoundException{
        if (floorHashMap.containsKey(name)){
            return floorHashMap.get(name);
        }
        else {
            throw new ObjectNotFoundException("Floor with the given name does not exists");
        }
    }

    @Override
    public ArrayList<Floor> getAllFloors(ParkingLot parkingLot) {
        ArrayList<Floor> floors = new ArrayList<>();
        for (Map.Entry<String, Floor> entry: floorHashMap.entrySet()){
            if(entry.getValue().getParkingLot().getName().equals(parkingLot.getName())){
                floors.add(entry.getValue());
            }
        }
        return floors;
    }
}
