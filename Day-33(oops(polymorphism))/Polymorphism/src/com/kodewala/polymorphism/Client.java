package com.kodewala.polymorphism;

public class Client {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		// For the user1, he/she selected payment method as a Credit Card
		CreditCardPayment cardPayment = new CreditCardPayment();
		paymentProcessor.processPayment(cardPayment);

		// For the user2, he/she selected payment method as a NetBanking
		NetBankingPayment netPayment = new NetBankingPayment();
		paymentProcessor.processPayment(netPayment);

		// For the user3, he/she selected payment method as a UpiPayment
		UPIPayment upiPayment = new UPIPayment();
		paymentProcessor.processPayment(upiPayment);
	}

}
