package com.lld.parking.services.spot;

import com.lld.parking.beans.VehicleBean;
import com.lld.parking.dao.spot.SpotSingleton;
import com.lld.parking.dao.vehicle.VehicleDAOSingleton;
import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.exceptions.SpotAlreadyAllocatedException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.Spot;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SpotService implements ISpotService{
    @Override
    public Spot addSpot(String name, Floor floor, SpotType spotType) {
        return SpotSingleton.getSpotDAO().add_spot(name, spotType, floor);
    }

    @Override
    public Spot removeSpot(String name) {
        try{
            return SpotSingleton.getSpotDAO().delete_spot(name);
        }
        catch (ObjectNotFoundException objectNotFoundException){
            return null;
        }
    }

    @Override
    public Spot getSpot(String name) {
        try{
            return SpotSingleton.getSpotDAO().get_spot(name);
        }
        catch (ObjectNotFoundException objectNotFoundException){
            return null;
        }
    }

    @Override
    public ArrayList<Spot> getAllSpots(Floor floor) {
        HashMap<String, Spot> spots_map = SpotSingleton.getSpotDAO().get_all_spots();
        List<Spot> filteredList = spots_map.entrySet().
                stream().
                filter(map-> map.getValue().getFloor().getName().equals(floor.getName())).
                map(stringSpotEntry -> stringSpotEntry.getValue()).
                collect(Collectors.toList());
        return (ArrayList<Spot>) filteredList;
    }

    @Override
    public ArrayList<Spot> getAvailableSpot(Floor floor) {
        return null;
    }

    @Override
    public boolean occupySpot(String name, VehicleBean vehicle) {
        try{
            Vehicle vehicle1 = VehicleDAOSingleton.getVehicleDAO().getVehicle(vehicle.getNumber());
            SpotSingleton.getSpotDAO().occupy_spot(name, vehicle1);
            return true;
        }
        catch (ObjectNotFoundException objectNotFoundException){
            return false;
        }
        catch (SpotAlreadyAllocatedException spotAlreadyAllocatedException){
            return false;
        }
    }

    @Override
    public boolean vacateSpot(String name) {
        try{
            SpotSingleton.getSpotDAO().vacate_spot(name);
            return true;

        }
        catch (ObjectNotFoundException objectNotFoundException){
            return false;
        }
    }
}
