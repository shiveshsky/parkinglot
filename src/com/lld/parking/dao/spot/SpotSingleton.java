package com.lld.parking.dao.spot;

public class SpotSingleton {
    private static SpotDAOImpl spotDAO;
    private SpotSingleton(){
        spotDAO = new SpotDAOImpl();
    }

    public static SpotDAOImpl getSpotDAO() {
        if(spotDAO == null){
            new SpotSingleton();
        }
        return spotDAO;
    }
}
