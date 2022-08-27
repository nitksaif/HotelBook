package com.hotel.HotelBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.websocket.server.PathParam;

import com.hotel.HotelBook.entities.Product;
import com.hotel.HotelBook.service.ProductService;

@RestController
public class ProductContorller {
	
	@Autowired
	ProductService productservice;
	
    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public void getHotels(@RequestBody Product p) {
    	productservice.addNewProduct(p);
    }
    
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
    	return productservice.getMyProducts();
    }
    
    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProducts(@PathVariable int id) {
    	return productservice.getProudctbyId(id);
    }
}
