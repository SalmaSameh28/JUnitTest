package org.example.service;

import org.example.model.User;

public class UserService {

    public boolean isAdult(User user){return user.getAge()>=10;}

    public String greet (User user){
        return "Hello"+ user.getName();
    }
}
