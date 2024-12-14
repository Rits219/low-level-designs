package com.shrayansh;

import com.shrayansh.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }
}
