package com.example.practice.pathVariable;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public String printUser(String userName) {
        return "My name is "+ userName;
    }
}
