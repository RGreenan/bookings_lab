package com.codeclan.bookingLab.bookingLab.controllers;

import com.codeclan.bookingLab.bookingLab.models.Course;
import com.codeclan.bookingLab.bookingLab.models.Customer;
import com.codeclan.bookingLab.bookingLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course>findCoursesWithRating(@PathVariable int rating){
        return courseRepository.findCoursesByStarRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course>findCoursesWithCustomer(@PathVariable Long id){
        return courseRepository.findCoursesWithCustomer(id);
    }
}
