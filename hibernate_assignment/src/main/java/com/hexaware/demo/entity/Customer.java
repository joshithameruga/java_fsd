package com.hexaware.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	
@NamedQuery(
name="getAllCustomers" ,
query ="from Customer"),

@NamedQuery(
name="getCustomerById" ,
query ="from Customer where customerId =:customerId"),

@NamedQuery(
name="getNameAndEmailOfCustomerById" ,
query ="select concat(c.firstName,' ',c.lastName),c.emailAddress from Customer c where c.customerId =:customerId")
})

public class Customer {
	
	@Id
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


	public int getCustomerid() {
		return customerId;
	}


	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}


	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}


	public String getLastname() {
		return lastName;
	}


	public void setLastname(String lastname) {
		this.lastName = lastname;
	}


	public String getEmailaddress() {
		return emailAddress;
	}


	public void setEmailaddress(String emailaddress) {
		this.emailAddress = emailaddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPhonenumber() {
		return phoneNumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phoneNumber = phonenumber;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerId + ", firstname=" + firstName + ", lastname=" + lastName
				+ ", emailaddress=" + emailAddress + ", password=" + password + ", phonenumber=" + phoneNumber + "]";
	}
}

