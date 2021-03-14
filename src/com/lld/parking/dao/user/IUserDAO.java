package com.lld.parking.dao.user;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.User;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.UserType;

public interface IUserDAO {
    public User addUser(String username, Vehicle vehicleType, UserType userType);
    public User getUser(String username) throws ObjectNotFoundException;
    public User deleteUser(String username) throws ObjectNotFoundException;
}
