package com.hotel.HotelBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.HotelBook.entities.User;
import com.hotel.HotelBook.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepository;
	
	public User getById(int id) {
        return userrepository.findById(id).get();
    }

    public List<User> getAll() {

        return userrepository.findAll();
    }

	public void addNewUser(User h) {
		userrepository.save(h);
	}
}
