package com.lld.parking.services.parkinglot;

import com.lld.parking.beans.FloorConfig;
import com.lld.parking.dao.parking.ParkingSingleton;
import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.ParkingLot;
import com.lld.parking.models.Spot;
import com.lld.parking.models.enums.SpotType;
import com.lld.parking.services.floor.FloorServiceImpl;
import com.lld.parking.services.spot.SpotService;
import com.lld.parking.services.strategy.IParkinglotFetchStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLotService implements IParkingService {

    @Override
    public ParkingLot addParkingLot(String name, String location, int number_of_floors, ArrayList<FloorConfig> floorConfigs) {
        ParkingLot parkingLot = ParkingSingleton.getParkinglotDAO().add_parkinglot(name, location);
        for(int i = 0; i<number_of_floors; i++){
            Floor floor = new FloorServiceImpl().addFloor(name + i, parkingLot, floorConfigs.get(i).getCapacity());
            for(Map.Entry<SpotType, Integer> entry: floorConfigs.get(i).getSpot_type_count().entrySet()){
                for(int j = 0; j< entry.getValue(); j++){
                    new SpotService().addSpot(floor.getName() + entry.getKey().name() + j, floor, entry.getKey());
                }
            }

        }
        return parkingLot;
    }

    @Override
    public ParkingLot removeParkingLot(String name) {
        try{
            return ParkingSingleton.getParkinglotDAO().delete_parkinglot(name);

        }
        catch (ObjectNotFoundException objectNotFoundException){
            return null;
        }
    }

    @Override
    public ParkingLot getParkingLot(IParkinglotFetchStrategy strategy) {
        HashMap<String, ParkingLot> allParkinglot = ParkingSingleton.getParkinglotDAO().getAllParkingLots();
        ArrayList<ParkingLot> parkingLots = (ArrayList<ParkingLot>) allParkinglot.entrySet().stream().map(stringParkingLotEntry -> stringParkingLotEntry.getValue()).collect(Collectors.toList());
        return strategy.getParkingLot(parkingLots);
    }

    @Override
    public ArrayList<Floor> getAllFloors(ParkingLot parkingLot) {
        // TODO get all floors of a com.lld.parking lot
        return null;
    }

    @Override
    public ArrayList<Spot> getAllAvailableSpots(Floor floor) {
        // todo get all available spots of a com.lld.parking lot
        return null;
    }
}
