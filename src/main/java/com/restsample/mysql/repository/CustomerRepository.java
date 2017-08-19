package com.restsample.mysql.repository;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.restsample.mysql.model.Customer;



public interface CustomerRepository extends CrudRepository<Customer, Long>{
	

}