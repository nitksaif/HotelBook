package com.hotel.HotelBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelBook.entities.Reservation;

	@Repository
	public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
