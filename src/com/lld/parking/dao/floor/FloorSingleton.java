package com.lld.parking.dao.floor;

public class FloorSingleton {
    private static FloorDAO floorDAO;

    private FloorSingleton(){
        floorDAO = new FloorDAO();
    }
    public static FloorDAO getFloorDAO(){
        if (floorDAO == null){
            new FloorSingleton();
        }
        return floorDAO;
    }
}
