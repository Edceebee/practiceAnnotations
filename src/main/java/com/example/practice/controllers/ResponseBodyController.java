package com.example.practice.controllers;

import com.example.practice.responseBody.User3;
import com.example.practice.responseBody.UserService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
/*
    no need to add @ResponseBody if you already ave @RestController
*/
public class ResponseBodyController {

    @Autowired
    UserService3 userService3;

    @GetMapping("/user3/")
    public User3 getUser(){

        return userService3.getUser();

    }
}
