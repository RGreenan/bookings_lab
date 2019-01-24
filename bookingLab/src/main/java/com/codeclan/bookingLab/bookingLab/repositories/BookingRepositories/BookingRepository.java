package com.codeclan.bookingLab.bookingLab.repositories.BookingRepositories;

import com.codeclan.bookingLab.bookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);


}
