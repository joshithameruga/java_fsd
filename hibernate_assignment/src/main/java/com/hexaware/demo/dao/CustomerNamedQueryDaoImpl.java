package com.hexaware.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.demo.Util;
import com.hexaware.demo.entity.Customer;

public class CustomerNamedQueryDaoImpl implements ICustomerNamedQueryDao{
 
	SessionFactory sessionFactory = Util.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction txn = null;
	
	@Override
	public List<Customer> getAllCustomers() {
		Query<Customer> query = session.createNamedQuery("getAllCustomers", Customer.class);	
		return query.list();
	}

	@Override
	public Customer getCustomerById(int id) {
		Query<Customer> query =session.createNamedQuery("getCustomerById", Customer.class);
		Customer customer = new Customer();
		query.setParameter("customerId", id);
		customer=query.getSingleResult();
		return customer;
		
	
	}

	@Override
	public Customer getNameAndEmailOfCustomerById(int id) {
		Query<Customer> query =session.createNamedQuery("getNameAndEmailOfCustomerById", Customer.class);
		Customer customer = new Customer();
		query.setParameter("customerId", id);
		customer=query.getSingleResult();
		return customer;
		
	}

	

	
	
}
