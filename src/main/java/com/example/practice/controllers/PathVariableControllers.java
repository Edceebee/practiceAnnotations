package com.example.practice.controllers;

import com.example.practice.pathVariable.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableControllers {

    @Autowired
    UserService userService;
    UserService userService2;

    @GetMapping("user1/{userName}")
    public String printUser(@PathVariable("userName") String userName){
        String result = userService.printUser(userName);

        return result;

    }

}
