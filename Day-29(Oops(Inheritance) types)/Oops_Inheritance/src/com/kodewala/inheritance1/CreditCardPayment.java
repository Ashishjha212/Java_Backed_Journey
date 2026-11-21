package com.kodewala.inheritance1;

public class CreditCardPayment extends Payment {
	String cardHolderName;

	public CreditCardPayment(String paymentId, double amount, String cardHolderName) {
		super(paymentId, amount);
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment...");
	}

	public void validateCard() {
		System.out.println(paymentId);
		System.out.println(amount);

	}

}
