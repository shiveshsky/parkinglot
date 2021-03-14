package com.lld.parking.dao.user;

public class UserSingleton {
    private static UserDAOImpl userDAO;
    private UserSingleton(){
        userDAO = new UserDAOImpl();
    }

    public static UserDAOImpl getUserDAO() {
        if (userDAO == null){
            new UserSingleton();
        }
        return userDAO;
    }
}
