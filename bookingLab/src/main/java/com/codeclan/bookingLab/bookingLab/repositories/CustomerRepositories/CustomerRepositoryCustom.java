package com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories;

import com.codeclan.bookingLab.bookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersWithCourse(Long courseId);
    List<Customer> findCustomersWithCourseAndTown(Long courseId, String town);
    List<Customer> findCustomersWithCourseAndTownAndOverAge(Long courseId, String town, int age);

}
