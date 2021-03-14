package com.lld.parking.dao.spot;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.exceptions.SpotAlreadyAllocatedException;
import com.lld.parking.models.Floor;
import com.lld.parking.models.Spot;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.SpotType;

import java.util.HashMap;

public interface ISpotDAO {
    public Spot add_spot(String name, SpotType spotType, Floor floor);
    public Spot occupy_spot(String spot_name, Vehicle vehicle) throws ObjectNotFoundException, SpotAlreadyAllocatedException;
    public Spot vacate_spot(String spot_name) throws ObjectNotFoundException;
    public Spot get_spot(String name) throws ObjectNotFoundException;
    public Spot delete_spot(String name) throws ObjectNotFoundException;
    public HashMap<String, Spot> get_all_spots();
}
