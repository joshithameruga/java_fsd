package com.hexaware.demo.dao;

import java.util.List;

import com.hexaware.demo.entity.Customer;

public interface ICustomerdao {
      
	void addCustomer(int id,String fname , String lname , String email,String password ,int number);
	
    Customer retrieveCustomer(int id);

	void updateCustomer(int id, String fname, String lname, String email, String password, int number);
    
	void updateCustomerPhonenumber(int id,int number);
	
    void deleteCustomer(int id);
    
    List<Customer> getAllCustomers();

}
