package com.example.practice.requestBody;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService2 {


    @Override
    public String printUser() {
        return "success";
    }
}
