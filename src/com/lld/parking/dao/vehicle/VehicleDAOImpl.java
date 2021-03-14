package com.lld.parking.dao.vehicle;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;
import com.lld.parking.models.enums.VehicleType;

import java.util.HashMap;

public class VehicleDAOImpl implements IVehicleDAO{
    HashMap<String, Vehicle> vehiclemap;
    public VehicleDAOImpl(){
        vehiclemap = new HashMap<>();
    }
    @Override
    public Vehicle addVehicle(String number, SpotType spotType_required, VehicleType vehicleType) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumber(number);
        vehicle.setSpottype_required(spotType_required);
        vehicle.setVehicleType(vehicleType);
        vehiclemap.put(number, vehicle);
        return vehicle;
    }

    @Override
    public Vehicle getVehicle(String number) throws ObjectNotFoundException {
        if (vehiclemap.containsKey(number)){
            return vehiclemap.get(number);
        }
        throw new ObjectNotFoundException("Vehicle not found exception");
    }

    @Override
    public Vehicle deleteVehicle(String number) throws ObjectNotFoundException {
        if (vehiclemap.containsKey(number)){
            return vehiclemap.remove(number);
        }
        throw new ObjectNotFoundException("Vehicle not found exception");
    }
}
