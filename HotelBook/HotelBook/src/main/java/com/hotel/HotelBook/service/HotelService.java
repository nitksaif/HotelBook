package com.hotel.HotelBook.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelBook.entities.Hotel;
import com.hotel.HotelBook.repository.HotelRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by yvladimirov on 31.03.15.
 */
@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelrepository;
	
	public Hotel getById(int id) {
        return hotelrepository.findById(id).get();
    }

    public List<Hotel> getAll() {

        return hotelrepository.findAll();
    }

	public void addNewHotel(Hotel h) {
		hotelrepository.save(h);
	}
}

