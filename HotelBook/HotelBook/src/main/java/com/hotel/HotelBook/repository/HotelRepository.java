package com.hotel.HotelBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelBook.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
