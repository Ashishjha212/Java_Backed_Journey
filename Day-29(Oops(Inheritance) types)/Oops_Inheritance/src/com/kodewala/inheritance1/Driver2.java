package com.kodewala.inheritance1;

public class Driver2 {

	public static void main(String[] args) {
		CreditCardPayment creditCardPayment = new CreditCardPayment("Aj123",10000.0, "Ashish");
		creditCardPayment.processPayment();
		creditCardPayment.validateCard();
		System.out.println("----------------------");
		UpiPayment upiPayment = new UpiPayment("Aj123",5000.0,"Aj@1234");
		upiPayment.processPayment();
		upiPayment.validateUPI();
	

	}

}
