package com.lld.parking.models;

import com.lld.parking.models.enums.SpotType;
import com.lld.parking.models.enums.VehicleType;

public class Vehicle {
    private String number;
    private SpotType spot_type_required;
    private VehicleType vehicleType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SpotType getSpot_type_required() {
        return spot_type_required;
    }

    public void setSpottype_required(SpotType spottype_required) {
        this.spot_type_required = spottype_required;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
