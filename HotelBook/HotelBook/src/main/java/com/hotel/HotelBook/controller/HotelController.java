package com.hotel.HotelBook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.HotelBook.entities.Hotel;
import com.hotel.HotelBook.entities.Hotels;
import com.hotel.HotelBook.entities.Reservation;
import com.hotel.HotelBook.entities.Reservations;
import com.hotel.HotelBook.service.HotelService;
import com.hotel.HotelBook.service.ReservationService;

/**
 * Created by yvladimirov on 30.03.15.
 */
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/addhotel/", method = RequestMethod.POST)
    public void getHotels(@RequestBody Hotel h) {
        hotelService.addNewHotel(h);
    }

    @RequestMapping(value = "/hotels/", method = RequestMethod.GET)
    public List<Hotel> getHotels() {
        return hotelService.getAll();
    }

    @RequestMapping(value = "/hotels/{hotelId}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int hotelId) {
        return hotelService.getById(hotelId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation", method = RequestMethod.GET)
    public List<Reservation> getReservation(@PathVariable int hotelId) {
        return reservationService.getAll(hotelId);
    }


    @RequestMapping(value = "/hotels/{hotelId}/reservation", method = RequestMethod.POST)
    public Reservation createReservation(@PathVariable int hotelId, @RequestBody Reservation reservation) {
        return reservationService.create(hotelId, reservation);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int hotelId, @PathVariable int reservationId) {
        return reservationService.getById(hotelId, reservationId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.DELETE)
    public Reservation deleteReservation(@PathVariable int hotelId, @PathVariable int reservationId) {
        return reservationService.delete(hotelId, reservationId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.PUT)
    public Reservation updateReservation(@PathVariable int hotelId, @PathVariable int reservationId, @RequestBody Reservation reservation) {
        return reservationService.update(hotelId, reservation);
    }
}
