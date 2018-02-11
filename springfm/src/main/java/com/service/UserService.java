package com.service;

import com.dao.UserDAO;

import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public List getAllUsers(){
        return userDAO.getAllUsers();
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
