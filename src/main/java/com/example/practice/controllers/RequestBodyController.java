package com.example.practice.controllers;

import com.example.practice.requestBody.User;
import com.example.practice.requestBody.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {
    @Autowired
    UserService2 userService2;

    @PostMapping ("/user2/")
    public String printUser(@RequestBody User user){
        System.out.println(user);
       return userService2.printUser();


    }
}
