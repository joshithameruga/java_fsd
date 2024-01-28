package com.hexaware.annotationpractice.entity;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    private double amount;
    private String modeOfPayment;
    
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(double amount, String modeOfPayment) {
		super();
		this.amount = amount;
		this.modeOfPayment = modeOfPayment;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	@Override
	public String toString() {
		return "Payment [amount=" + amount + ", modeOfPayment=" + modeOfPayment + "]";
	}
}
