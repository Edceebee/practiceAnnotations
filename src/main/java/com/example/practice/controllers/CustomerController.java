package com.example.practice.controllers;

import com.example.practice.autowiredList.Customer;
import com.example.practice.autowiredList.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService<Customer> customerService;

    @GetMapping("/customer")
    public List<Customer> getList(){
       return customerService.getCustomers();
    }
}
