package com.lld.parking.services.vehicle;

import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;
import com.lld.parking.models.enums.VehicleType;

public interface IVehicleService {
    public Vehicle addVehicle(String number, SpotType required_spot_type, VehicleType vehicleType);
    public boolean deleteVehicle(String number);

}
