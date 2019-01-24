package com.codeclan.bookingLab.bookingLab.repositories.CourseRepository;

import com.codeclan.bookingLab.bookingLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findCoursesWithCustomer(Long id);
}
