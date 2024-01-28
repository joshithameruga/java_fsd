package com.hexaware.demo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.demo.Util;
import com.hexaware.demo.entity.Customer;

public class CustomerDao implements ICustomerdao {
	
	SessionFactory sessionFactory = Util.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction txn =null;

	@Override
	public void addCustomer(int id,String fname , String lname , String email,String password ,int number ) {
		 txn = session.beginTransaction();
		Customer customer=new Customer();
    	customer.setCustomerid(id);
    	customer.setFirstname(fname);
    	customer.setLastname(lname);
    	customer.setEmailaddress(email);
    	customer.setPassword(password);
    	customer.setPhonenumber(number);
    	session.save(customer);
    	txn.commit();
         
   }

	@Override
	public Customer retrieveCustomer(int id) {
		
		Customer retrievedCustomer = session.get(Customer.class, id);
		return retrievedCustomer;
		
	}

	@Override
	public void updateCustomer(int id, String fname , String lname , String email,String password ,int number) {
		txn = session.beginTransaction();
		
		Customer retrievedCustomer = session.get(Customer.class, id);
		retrievedCustomer.setFirstname(fname);
		retrievedCustomer.setLastname(lname);
		retrievedCustomer.setEmailaddress(email);
		retrievedCustomer.setPassword(password);
		retrievedCustomer.setPhonenumber(number);
		session.update(retrievedCustomer);
		txn.commit();
	
		
	}

	@Override
	public void deleteCustomer(int id) {
		 txn = session.beginTransaction();
        Customer retrievedCustomer = session.get(Customer.class, id);
        session.delete(retrievedCustomer);
		txn.commit();
	}

	@Override
	public List<Customer> getAllCustomers() {
	     
	      String hql = "from Customer";
	      Query<Customer> query = session.createQuery(hql,Customer.class);
	      return query.list();
		
	}

	@Override
	public void updateCustomerPhonenumber(int id, int number) {
		txn = session.beginTransaction();
		Customer obtainedCustomer = session.get(Customer.class, id);
		obtainedCustomer.setPhonenumber(number);
		session.update(obtainedCustomer);
		txn.commit();
	}
		
	


}


