package com.lld.parking.beans;

import com.lld.parking.models.enums.SpotType;

import java.util.HashMap;

public class FloorConfig {
    private int capacity;
    private HashMap<SpotType, Integer> spot_type_count = new HashMap<>();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<SpotType, Integer> getSpot_type_count() {
        return spot_type_count;
    }

    public void setSpot_type_count(HashMap<SpotType, Integer> spot_type_count) {
        this.spot_type_count = spot_type_count;
    }
}
