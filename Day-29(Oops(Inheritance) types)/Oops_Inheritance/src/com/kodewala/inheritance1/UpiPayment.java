package com.kodewala.inheritance1;

public class UpiPayment extends Payment{
	String upiId;

	
	public UpiPayment(String paymentId, double amount, String upiId) {
		super(paymentId, amount);
		this.upiId = upiId;
	}
	@Override
	public void processPayment() {
		System.out.println("Processing UPI payment...");
	}



	public void validateUPI() {
		System.out.println(paymentId);
		System.out.println(amount);
		System.out.println("Validating UPI ID...");
	}

}
