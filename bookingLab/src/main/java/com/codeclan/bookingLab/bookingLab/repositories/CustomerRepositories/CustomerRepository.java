package com.codeclan.bookingLab.bookingLab.repositories.CustomerRepositories;

import com.codeclan.bookingLab.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
