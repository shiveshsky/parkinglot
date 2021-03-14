package com.lld.parking.dao.spot;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.exceptions.SpotAlreadyAllocatedException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.Spot;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;

import java.util.HashMap;
import java.util.Map;

public class SpotDAOImpl implements ISpotDAO {
    HashMap<String, Spot> spotHashMap;
    public SpotDAOImpl(){
        spotHashMap = new HashMap<>();
    }

    @Override
    public Spot add_spot(String name, SpotType spotType, Floor floor) {
        Spot spot = new Spot();
        spot.setSpotName(name);
        spot.setFloor(floor);
        spot.setSpotType(spotType);
        spotHashMap.put(name, spot);
        return spot;
    }

    @Override
    public Spot occupy_spot(String spot_name, Vehicle vehicle) throws ObjectNotFoundException, SpotAlreadyAllocatedException {
        for(Map.Entry<String, Spot> entry: spotHashMap.entrySet()){
            if (entry.getKey().equals(spot_name)){
                if (entry.getValue().isAvailable()){
                    Spot spot = entry.getValue();
                    spot.setAvailable(false);
                    spot.setVehicle(vehicle);
                    return spot;
                }
                else {
                    throw new SpotAlreadyAllocatedException("Spot Already Allocated");
                }

            }
        }
        throw new ObjectNotFoundException("Spot not found");
    }

    @Override
    public Spot get_spot(String spot_name) throws ObjectNotFoundException {
        for(Map.Entry<String, Spot> entry: spotHashMap.entrySet()){
            if (entry.getKey().equals(spot_name)){
                Spot spot = entry.getValue();
                return spot;
            }
        }
        throw new ObjectNotFoundException("Spot not found");
    }

    @Override
    public Spot vacate_spot(String spot_name) throws ObjectNotFoundException {
        for(Map.Entry<String, Spot> entry: spotHashMap.entrySet()){
            if (entry.getKey().equals(spot_name)){
                Spot spot = entry.getValue();
                spot.setAvailable(true);
                spot.setVehicle(null);
                return spot;
            }
        }
        throw new ObjectNotFoundException("Spot not found");
    }

    @Override
    public Spot delete_spot(String spot_name) throws ObjectNotFoundException {
        for(Map.Entry<String, Spot> entry: spotHashMap.entrySet()){
            if (entry.getKey().equals(spot_name)){
                Spot spot = entry.getValue();
                return spot;
            }
        }
        throw new ObjectNotFoundException("Spot not found");
    }

    @Override
    public HashMap<String, Spot> get_all_spots() {
        return spotHashMap;
    }
}