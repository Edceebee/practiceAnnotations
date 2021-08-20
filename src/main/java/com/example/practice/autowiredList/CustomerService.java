package com.example.practice.autowiredList;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService <T> {
     List<T> getCustomers();
}
