package com.codeclan.bookingLab.bookingLab.controllers;

import com.codeclan.bookingLab.bookingLab.models.Customer;
import com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findCustomersWithCourse(@PathVariable Long courseId){
        return customerRepository.findCustomersWithCourse(courseId);
    }

}
