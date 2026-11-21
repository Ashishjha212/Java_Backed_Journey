package com.kodewala.inheritance1;

public class Payment {
	String paymentId;
	double amount;
	public Payment(String paymentId, double amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}
	public void processPayment() {
		System.out.println("processPayment()");
	}
	public void displayPaymentDetails() {
		System.out.println(paymentId);
		System.out.println(amount);
	}
}
