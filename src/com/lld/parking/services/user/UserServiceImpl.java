package com.lld.parking.services.user;

import com.lld.parking.beans.VehicleBean;
import com.lld.parking.dao.user.UserSingleton;
import com.lld.parking.dao.vehicle.VehicleDAOSingleton;
import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.User;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.UserType;

public class UserServiceImpl implements IUserService{
    @Override
    public User addUser(String username, UserType userType) {
        return UserSingleton.getUserDAO().addUser(username, null, userType);
    }

    @Override
    public User addUser(String username, VehicleBean vehiclebean, UserType userType) {
        Vehicle new_vehicle = VehicleDAOSingleton.getVehicleDAO().addVehicle(vehiclebean.getNumber(),
                vehiclebean.getSpot_type_required(), vehiclebean.getVehicleType());
        return UserSingleton.getUserDAO().addUser(username, new_vehicle, userType);
    }

    @Override
    public boolean deleteUser(String username) {
        try{
            UserSingleton.getUserDAO().deleteUser(username);
            return true;
        }
        catch (ObjectNotFoundException notFoundException){
            return false;
        }

    }
}
