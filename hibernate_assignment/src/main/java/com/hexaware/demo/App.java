package com.hexaware.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.demo.dao.CustomerDao;
import com.hexaware.demo.dao.CustomerNamedQueryDaoImpl;
import com.hexaware.demo.entity.Customer;




public class App 
{
	
	
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = Util.getSessionFactory();
    	
    	System.out.println(sessionFactory);
    	
    	Session session = sessionFactory.openSession();
    	
    	System.out.println(session);
    	
    	CustomerDao customerDao = new CustomerDao();
    	
    	CustomerNamedQueryDaoImpl namedquerydao = new CustomerNamedQueryDaoImpl();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	
    	/*//inserting my first record
    	Transaction txn = session.beginTransaction();    	
    	Customer c1=new Customer();
    	c1.setCustomerid(1);
    	c1.setFirstname("monica");
    	c1.setLastname("geller");
    	c1.setEmailaddress("monica@geller");
    	c1.setPassword("monicapassword");
    	c1.setPhonenumber(90986542);
    	session.save(c1);
    	
    	Customer c2=new Customer();
    	c2.setCustomerid(2);
    	c2.setFirstname("ross");
    	c2.setLastname("geller");
    	c2.setEmailaddress("ross@geller");
    	c2.setPassword("rosspassword");
    	c2.setPhonenumber(8766542);
    	session.save(c2);
    	
    	txn.commit();  */
    	
    	//retrieving a single customer
    	System.out.println("enter id to retreive a customer");
    	int id =sc.nextInt();
		System.out.println(customerDao.retrieveCustomer(id));
    	
		
		//inserting a customer
		customerDao.addCustomer(3, "rachel", "green", "rachel@green", "rachelpassword", 764532);
		
		//updating customer
		customerDao.updateCustomer(2, "ross", "geller", "dr.ross@geller", "ross@geller", 987654);
    	
		
		
		//deleting customer
		customerDao.deleteCustomer(3);
		
		//retrieving all customers
		List<Customer> c = customerDao.getAllCustomers();
		for (Customer customer : c) {
			System.out.println(customer.toString());
		}
		
    	
    	
		//implementing named queries
		List<Customer> customer = namedquerydao.getAllCustomers();
		for (Customer customer2 : customer) {
			System.out.println(customer2.toString());
		}
		
		Customer customer3=namedquerydao.getCustomerById(2);
		System.out.println(customer3.toString());
		
		//updating customer phone number
				customerDao.updateCustomerPhonenumber(1, 8765432);
		
    }
}
