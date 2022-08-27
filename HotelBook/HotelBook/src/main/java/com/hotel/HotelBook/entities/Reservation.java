package com.hotel.HotelBook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by yvladimirov on 31.03.15.
 */

@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    
    @Column
    private int price;
    
    @Column
    private int userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	


}
