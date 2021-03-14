package com.lld.parking.dao.vehicle;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;
import com.lld.parking.models.enums.VehicleType;

public interface IVehicleDAO {
    public Vehicle addVehicle(String number, SpotType spotType_required, VehicleType vehicleType);
    public Vehicle getVehicle(String number) throws ObjectNotFoundException;
    public Vehicle deleteVehicle(String number) throws ObjectNotFoundException;
}
