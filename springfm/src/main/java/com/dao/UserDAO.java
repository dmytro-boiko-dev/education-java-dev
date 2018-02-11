package com.dao;

import com.models.User;

import java.util.Arrays;
import java.util.List;

public class UserDAO {

    private List users = Arrays.asList(
            new User("name1", "surname1", 12),
            new User("name2", "surname2", 13)
    );

    public List getAllUsers(){
        return users;
    }
}
