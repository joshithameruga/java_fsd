package com.hexaware.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc.model.Customer; // Updated import statement

public class CustomerMapper implements RowMapper<Customer> { // Updated class name and type parameter

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        Customer customer = new Customer(); // Updated class type

        customer.setCustomerId(rs.getInt("customerid")); // Updated field name
        customer.setFirstName(rs.getString("firstname"));
        customer.setLastName(rs.getString("lastname"));// Updated field name
        customer.setEmailAddress(rs.getString("emailaddress"));
        customer.setPassword(rs.getString("password"));
        customer.setPhoneNumber(rs.getInt("phonenumber"));// Updated field name

        return customer;
    }
}
