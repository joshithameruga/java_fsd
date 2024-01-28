package com.hexaware.annotationpractice.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
      private String name ;
      private String email;
      
      //@Autowired
      private Payment payment;
      
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
		
		//@Autowired
	    public Customer(Payment payment) {
	        this.payment = payment;
	    }
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Payment getPayment() {
		return payment;
	}
	@Autowired
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", payment=" + payment + "]";
	}
	public Customer(String name, String email, Payment payment) {
		super();
		this.name = name;
		this.email = email;
		this.payment = payment;
	}
}
