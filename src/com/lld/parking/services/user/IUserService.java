package com.lld.parking.services.user;

import com.lld.parking.beans.VehicleBean;
import com.lld.parking.models.User;
import com.lld.parking.models.enums.UserType;

public interface IUserService {
    public User addUser(String username, VehicleBean vehicle, UserType userType);
    public User addUser(String username, UserType userType);
    public boolean deleteUser(String username);

}
