package com.codeclan.bookingLab.bookingLab.components;

import com.codeclan.bookingLab.bookingLab.models.Booking;
import com.codeclan.bookingLab.bookingLab.models.Course;
import com.codeclan.bookingLab.bookingLab.models.Customer;
import com.codeclan.bookingLab.bookingLab.repositories.BookingRepositories.BookingRepository;
import com.codeclan.bookingLab.bookingLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Intro To Python", "Edinburgh", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Intro To Ruby", "Edinburgh", 2);
        courseRepository.save(course2);
        Course course3 = new Course("Intro To Java", "Glasgow", 4);
        courseRepository.save(course3);

        Customer customer1 = new Customer("James", "Dundee", 28);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Arnold", "Inverness", 40);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Michelle", "Aberdeen", 28);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("01-01-18", course2, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("21-04-19", course2, customer3);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("21-04-19", course1, customer3);
        bookingRepository.save(booking3);
    }
}
