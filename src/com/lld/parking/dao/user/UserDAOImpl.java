package com.lld.parking.dao.user;

import com.lld.parking.exceptions.ObjectNotFoundException;
import com.lld.parking.models.User;
import com.lld.parking.models.Vehicle;
import com.lld.parking.models.enums.UserType;

import java.util.HashMap;

public class UserDAOImpl implements IUserDAO{
    HashMap<String, User> userHashMap;
    public UserDAOImpl(){
        userHashMap = new HashMap<>();
    }

    @Override
    public User addUser(String username, Vehicle vehicle, UserType userType) {
        User user = new User();
        user.setName(username);
        user.setVehicle(vehicle);
        user.setUserType(userType);
        userHashMap.put(username, user);
        return user;
    }

    @Override
    public User getUser(String username) throws ObjectNotFoundException {
        if (userHashMap.containsKey(username)){
            return userHashMap.get(username);
        }
        throw new ObjectNotFoundException("User not found exception");
    }

    @Override
    public User deleteUser(String username) throws ObjectNotFoundException {
        if (userHashMap.containsKey(username)){
            return userHashMap.remove(username);
        }
        throw new ObjectNotFoundException("User not found exception");
    }
}
