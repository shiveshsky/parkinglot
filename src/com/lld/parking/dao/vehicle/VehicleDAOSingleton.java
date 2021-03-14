package com.lld.parking.dao.vehicle;

public class VehicleDAOSingleton {
    private static VehicleDAOImpl vehicleDAO;
    private VehicleDAOSingleton(){
        vehicleDAO = new VehicleDAOImpl();
    }

    public static VehicleDAOImpl getVehicleDAO() {
        if (vehicleDAO == null){
            new VehicleDAOSingleton();
        }
        return vehicleDAO;
    }
}
