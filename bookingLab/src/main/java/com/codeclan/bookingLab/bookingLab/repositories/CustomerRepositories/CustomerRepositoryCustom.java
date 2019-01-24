package com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories;

import com.codeclan.bookingLab.bookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersWithCourse(Long courseId);

}
