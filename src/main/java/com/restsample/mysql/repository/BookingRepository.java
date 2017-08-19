package com.restsample.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restsample.mysql.model.Booking;


public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	

}
