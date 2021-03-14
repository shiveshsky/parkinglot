package com.lld.parking.services.spot;

import com.lld.parking.beans.VehicleBean;
import com.lld.parking.models.Floor;
import com.lld.parking.models.Spot;
import com.lld.parking.models.enums.SpotType;

import java.util.ArrayList;

public interface ISpotService {
    public Spot addSpot(String name, Floor floor, SpotType spotType);
    public Spot removeSpot(String name);
    public Spot getSpot(String name);
    public ArrayList<Spot> getAllSpots(Floor floor);
    public ArrayList<Spot> getAvailableSpot(Floor floor);
    public boolean occupySpot(String name, VehicleBean vehicleBean);
    public boolean vacateSpot(String name);

}
