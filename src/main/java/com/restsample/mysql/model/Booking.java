package com.restsample.mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id 
	@GeneratedValue
	private int id;
	
	private String bookingName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	
	
	public Booking(int i, String bookingName) {
		super();	
		this.id = i;
		this.bookingName = bookingName;
	}
	
	public Booking() {
		
	}
	
	
}