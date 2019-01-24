package com.codeclan.bookingLab.bookingLab.repositories.BookingRepositories;

import com.codeclan.bookingLab.bookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
