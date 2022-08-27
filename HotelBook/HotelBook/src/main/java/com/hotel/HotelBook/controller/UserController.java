package com.hotel.HotelBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.HotelBook.entities.User;
import com.hotel.HotelBook.service.UserService;

@RestController
public class UserController {
	
    @Autowired
    private UserService userservice;
    
    @RequestMapping(value = "/addUser/", method = RequestMethod.POST)
    public void addUser(@RequestBody User u) {
        userservice.addNewUser(u);
    }


    @RequestMapping(value = "/users/", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userservice.getAll();
    }
    
    @RequestMapping(value = "/users/{userid}", method = RequestMethod.GET)
    public User getUser(@PathVariable int userid) {
        return userservice.getById(userid);
    }

}
