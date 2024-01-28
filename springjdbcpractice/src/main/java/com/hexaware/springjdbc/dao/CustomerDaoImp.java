package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Customer; // Updated import statement

@Repository
public class CustomerDaoImp implements ICustomerDao { // Updated class name and interface

    JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImp(DataSource datasource) {

        jdbcTemplate = new JdbcTemplate(datasource);

        System.out.println(jdbcTemplate);
    }

    @Override
    public boolean createCustomer(Customer customer) { // Updated method parameter type

        String insertQuery = "insert into Customer(customerId, firstName ,lastName,emailAddress,password,phoneNumber) values(?,?,?,?,?,?)"; // Updated query

        int count = jdbcTemplate.update(insertQuery, customer.getCustomerId(), customer.getFirstName(),
                customer.getLastName(),customer.getEmailAddress(),customer.getPassword(),customer.getPhoneNumber());

        return count > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) { // Updated method parameter type

        String updateQuery = "update customer set firstName = ? , lastName= ? ,emailAddress = ? , password=?,phonenumber=? where customerId = ?"; // Updated query

        int count = jdbcTemplate.update(updateQuery,  customer.getFirstName(),
                customer.getLastName(),customer.getEmailAddress(),customer.getPassword(),customer.getPhoneNumber(),customer.getCustomerId());


        return count > 0;
    }

    @Override
    public boolean deleteCustomerById(int customerId) { // Updated method parameter type

        String deleteQuery = "delete from customer  where customerId = ?"; // Updated query

        int count = jdbcTemplate.update(deleteQuery, customerId);

        return count > 0;
    }

    @Override
    public Customer selectCustomerById(int customerId) { // Updated return type and method parameter type

        String selectQueryById = "select customerId, firstName ,lastName,emailAddress,password,phoneNumber from customer where customerId = ?"; // Updated query

        Customer customer = jdbcTemplate.queryForObject(selectQueryById, new CustomerMapper(), customerId);

        return customer;
    }

    @Override
    public List<Customer> selectAllCustomers() { // Updated return type

        String selectQuery = "select customerId, firstName ,lastName,emailAddress,password,phoneNumber from customer"; // Updated query

        List<Customer> list = jdbcTemplate.query(selectQuery, new CustomerMapper());

        return list;
    }
}
