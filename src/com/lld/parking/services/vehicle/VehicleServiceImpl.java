package com.lld.parking.services.vehicle;

import com.lld.parking.dao.vehicle.VehicleDAOSingleton;
import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;
import com.lld.parking.models.enums.VehicleType;

public class VehicleServiceImpl implements IVehicleService{
    @Override
    public Vehicle addVehicle(String number, SpotType required_spot_type, VehicleType vehicleType) {
        return VehicleDAOSingleton.getVehicleDAO().addVehicle(number, required_spot_type, vehicleType);
    }

    @Override
    public boolean deleteVehicle(String number) {
        try{
            Vehicle vehicle = VehicleDAOSingleton.getVehicleDAO().deleteVehicle(number);
            return true;
        }
        catch (ObjectNotFoundException notfound){
            return false;
        }
    }
}
