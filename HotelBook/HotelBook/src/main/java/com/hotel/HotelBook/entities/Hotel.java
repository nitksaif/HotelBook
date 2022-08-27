package com.hotel.HotelBook.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yvladimirov on 31.03.15.
 */
@Entity
@Table(name = "Hotel")
public class Hotel implements Serializable {
	
    @Id
    @GeneratedValue
    private int id;
    
	@Column
    private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
