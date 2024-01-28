package com.hexaware.demo.dao;

import java.util.List;

import com.hexaware.demo.entity.Customer;

public interface ICustomerNamedQueryDao{
  
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(int id);
	
	Customer getNameAndEmailOfCustomerById(int id);
	
	
}
