package com.example.practice.autowiredList;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    public static List<Customer> customers = new ArrayList<>();



    static {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setAge(25L);
        customer1.setLocation("Yaba");
        customer1.setName("Oppo");
        customers.add(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setAge(22L);
        customer2.setLocation("Sabo");
        customer2.setName("Mumu");
        customers.add(customer2);

        Customer customer3 = new Customer();
        customer3.setId(1L);
        customer3.setAge(25L);
        customer3.setLocation("Ojota");
        customer3.setName("Ode");
        customers.add(customer3);

    }
    public List<Customer> getCustomers() {
        return customers;
    }

    }



