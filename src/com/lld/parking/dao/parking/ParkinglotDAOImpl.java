package com.lld.parking.dao.parking;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.ParkingLot;

import java.util.HashMap;

public class ParkinglotDAOImpl implements IParkingDAO{
    private HashMap<String, ParkingLot> parkingLotHashMap;
    public ParkinglotDAOImpl(){
        parkingLotHashMap = new HashMap<String, ParkingLot>();
    }
    @Override
    public ParkingLot add_parkinglot(String name, String location) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(name);
        parkingLot.setLocation(location);
        parkingLotHashMap.put(name, parkingLot);
        return parkingLot;
    }

    @Override
    public ParkingLot get_parkinglot(String name) throws ObjectNotFoundException {
        if (parkingLotHashMap.containsKey(name)){
            return parkingLotHashMap.get(name);
        }
        else {
            throw new ObjectNotFoundException("Paring with the given name does not exists");
        }

    }

    @Override
    public ParkingLot delete_parkinglot(String name) throws ObjectNotFoundException {
        if (parkingLotHashMap.containsKey(name)){
            return parkingLotHashMap.remove(name);
        }
        else {
            throw new ObjectNotFoundException("Paring with the given name does not exists");
        }
    }

    @Override
    public HashMap<String, ParkingLot> getAllParkingLots() {
        return parkingLotHashMap;
    }
}
