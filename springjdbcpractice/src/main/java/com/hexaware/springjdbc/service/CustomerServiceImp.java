package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.ICustomerDao; // Updated import statement
import com.hexaware.springjdbc.model.Customer; // Updated import statement

@Service
public class CustomerServiceImp implements ICustomerService { // Updated class name and interface

    @Autowired
    ICustomerDao dao; // Updated interface type

    @Override
    public boolean createCustomer(Customer customer) { // Updated method parameter type
        return dao.createCustomer(customer); // Updated method parameter type
    }

    @Override
    public boolean updateCustomer(Customer customer) { // Updated method parameter type
        return dao.updateCustomer(customer); // Updated method parameter type
    }

    @Override
    public boolean deleteCustomerById(int customerId) { // Updated method parameter type
        return dao.deleteCustomerById(customerId); // Updated method parameter type
    }

    @Override
    public Customer selectCustomerById(int customerId) { // Updated return type and method parameter type
        return dao.selectCustomerById(customerId); // Updated method parameter type
    }

    @Override
    public List<Customer> selectAllCustomers() { // Updated return type
        return dao.selectAllCustomers(); // Updated return type
    }
}
