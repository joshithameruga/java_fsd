package com.hexaware.springjdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private int phoneNumber;
	
	public Customer() {
		super();
		
	}
	

	public Customer(int customerid, String firstname, String lastname, String emailaddress, String password,
			int phonenumber) {
		super();
		this.customerId = customerid;
		this.firstName = firstname;
		this.lastName = lastname;
		this.emailAddress = emailaddress;
		this.password = password;
		this.phoneNumber = phonenumber;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerid) {
		this.customerId = customerid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastname) {
		this.lastName = lastname;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailaddress) {
		this.emailAddress = emailaddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phonenumber) {
		this.phoneNumber = phonenumber;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerId + ", firstname=" + firstName + ", lastname=" + lastName
				+ ", emailaddress=" + emailAddress + ", password=" + password + ", phonenumber=" + phoneNumber + "]";
	}
}
