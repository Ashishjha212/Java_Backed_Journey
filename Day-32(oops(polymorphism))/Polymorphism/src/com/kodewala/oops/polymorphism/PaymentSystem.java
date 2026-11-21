package com.kodewala.oops.polymorphism;

public class PaymentSystem {

	public static void main(String[] args) {
		Payment payment;
		payment=new UPIPayment();
		payment.processPayment(500.75);
		payment=new CCPay();
		payment.processPayment(1200.50);

	}

}
