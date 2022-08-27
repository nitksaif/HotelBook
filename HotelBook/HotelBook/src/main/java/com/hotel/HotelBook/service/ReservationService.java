package com.hotel.HotelBook.service;


import com.hotel.HotelBook.entities.Hotel;
import com.hotel.HotelBook.entities.Reservation;
import com.hotel.HotelBook.entities.Reservations;
import com.hotel.HotelBook.repository.HotelRepository;
import com.hotel.HotelBook.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yvladimirov on 31.03.15.
 */
@Service
public class ReservationService {
    private Map<Integer, List<Reservation>> hotelsReservation = new HashMap<Integer, List<Reservation>>();

    @Autowired
    ReservationRepository reservationrepository;
    
    @Autowired
    HotelRepository hotelrepository;
    
    public List<Reservation> getAll(int id) {
    	return reservationrepository.findAll();
    	
    	/*
        List<Reservation> reservations = hotelsReservation.get(hotelId);
        reservations = reservations == null ? new ArrayList<Reservation>() : reservations;
        return new Reservations(reservations, 100, 0, reservations.size());
        */
    }

    public Reservation create(int hotelId, Reservation reservation) {
    	/*
        if (!hotelsReservation.containsKey(hotelId)) {
            hotelsReservation.put(hotelId, new ArrayList<Reservation>());
        }
        hotelsReservation.get(hotelId).add(reservation);
        return reservation;
        */
    	Hotel hotel=hotelrepository.findById(hotelId).get();
    	
    	return reservationrepository.save(reservation);
    }

    public Reservation getById(int hotelId, int reservationId) {
        List<Reservation> reservations = hotelsReservation.get(hotelId);
        if (reservations != null) {
            for (Reservation r : reservations) {
                if (r.getId() == reservationId) {
                    return r;
                }
            }
        }
        return null;
    }

    public Reservation delete(int hotelId, int reservationId) {
        List<Reservation> reservations = hotelsReservation.get(hotelId);
        if (reservations != null) {
            for (Reservation r : reservations) {
                if (r.getId() == reservationId) {
                    reservations.remove(r);
                    return r;
                }
            }
        }
        return null;
    }

    public Reservation update(int hotelId, Reservation reservation) {
        List<Reservation> reservations = hotelsReservation.get(hotelId);
        if (reservations != null) {
            for (Reservation r : reservations) {
                if (r.getId() == reservation.getId()) {
                    reservations.remove(reservation);
                    reservations.add(reservation);
                    return reservation;
                }
            }
        }
        return null;
    }

}