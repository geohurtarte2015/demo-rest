package com.restsample.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;


 

 
@Entity
public class Customer {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerID;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int    age;
	
	public Customer(){}
 
	public Customer(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
 
	public long getCustomerID() {
		return customerID;
	}
 
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
 
}