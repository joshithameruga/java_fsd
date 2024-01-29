package com.hexaware.aop_practice.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop_practice.exception.CustomerNotFoundException;

@Service
public class CustomerService {
	
   
    
    public void deleteCustomer() {
    	System.out.println("deleted the customer");
    }
    
    public void updateCustomer() {
    	System.out.println("updated customer details");
    }
    
    public void addCustomer() {
    	System.out.println("customer added");
    }
    
    public String getCustomer(int id) throws CustomerNotFoundException {
    	String customer=null;
    	if(id > 100) {
    	System.out.println("got customer");
    	customer="customer 1 : rachel" ;
    	}
    	else {
    		throw new CustomerNotFoundException();
    	}
    	return customer;
    }
}
