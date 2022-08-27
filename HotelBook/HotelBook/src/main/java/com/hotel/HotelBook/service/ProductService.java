package com.hotel.HotelBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelBook.entities.Product;
import com.hotel.HotelBook.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrespository;
	
	public void addNewProduct(Product p) {
		productrespository.save(p);
	} 
	
	public List<Product> getMyProducts() {
		return productrespository.findAll();
	}
	
	public Product getProudctbyId(int id) {
		return productrespository.findById(id).get();
	} 
}
