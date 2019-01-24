package com.codeclan.bookingLab.bookingLab.controllers;

import com.codeclan.bookingLab.bookingLab.models.Customer;
import com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @GetMapping(value = "course/{courseId}/town/{town}")
    public List<Customer> findCustomersWithCourseAndTown(@PathVariable Long courseId, @PathVariable String town){
        return customerRepository.findCustomersWithCourseAndTown(courseId, town);
    }

    @GetMapping(value = "course/{courseId}/town/{town}/age/{age}")
    public List<Customer> findCustomersWithCourseAndTownAndOverAge(@PathVariable Long courseId, @PathVariable String town, @PathVariable int age){
        return customerRepository.findCustomersWithCourseAndTownAndOverAge(courseId, town, age);
    }

}
