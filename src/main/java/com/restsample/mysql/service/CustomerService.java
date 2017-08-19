package com.restsample.mysql.service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.restsample.mysql.model.Customer;
import com.restsample.mysql.repository.CustomerRepository;


@Service
@Transactional
public class CustomerService {
	
	
	private final CustomerRepository customerRepository;
	
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public List<Customer> findAll(){		
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		for (Customer customer : customers) {
			System.out.println("Customer: " + customer.toString());
		}
		return customers;
	}
	
	public void save(Customer customer ) {
		customerRepository.save(customer);
	}
	
	
}
