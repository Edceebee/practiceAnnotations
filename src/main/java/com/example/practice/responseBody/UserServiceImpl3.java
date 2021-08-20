package com.example.practice.responseBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl3 implements UserService3 {

    public User3 getUser(){

        User3 user = new User3();

        user.setName("Nonso");
        user.setAge(25L);
        user.setLocation("Mainland");

        return user;


    }

}
