package com.lld.parking.dao.parking;

public class ParkingSingleton {
    private static ParkinglotDAOImpl parkinglotDAO;
    private ParkingSingleton(){
        parkinglotDAO = new ParkinglotDAOImpl();
    }
    public static ParkinglotDAOImpl getParkinglotDAO(){
        if (parkinglotDAO == null){
            new ParkingSingleton();
        }
        return parkinglotDAO;
    }
}
