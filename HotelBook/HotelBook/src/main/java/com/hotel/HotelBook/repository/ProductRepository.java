package com.hotel.HotelBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelBook.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
