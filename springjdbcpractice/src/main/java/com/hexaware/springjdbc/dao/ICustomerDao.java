package com.hexaware.springjdbc.dao;

import java.util.List;

import com.hexaware.springjdbc.model.Customer; // Updated import statement

public interface ICustomerDao { // Updated interface name

    public boolean createCustomer(Customer customer); // Updated method parameter type
    public boolean updateCustomer(Customer customer); // Updated method parameter type

    public boolean deleteCustomerById(int customerId); // Updated method parameter type

    public Customer selectCustomerById(int customerId); // Updated return type and method parameter type

    public List<Customer> selectAllCustomers(); // Updated return type
}
