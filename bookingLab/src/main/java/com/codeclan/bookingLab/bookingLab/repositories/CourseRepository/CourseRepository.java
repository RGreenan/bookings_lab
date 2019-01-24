package com.codeclan.bookingLab.bookingLab.repositories.CourseRepository;

import com.codeclan.bookingLab.bookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findCoursesByStarRating(int rating);

}
