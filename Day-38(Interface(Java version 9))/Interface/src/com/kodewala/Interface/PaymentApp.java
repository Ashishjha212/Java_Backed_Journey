package com.kodewala.Interface;

public class PaymentApp {
	public static void main(String[] args) {
		PaymentGateway.checkServiceStatus();
		
		PaymentGateway cc = new CreditCardPayment();
		cc.validateTransaction();
		cc.processPayment(5000);
		
		PaymentGateway upi = new UPIPayments();
		upi.validateTransaction();
		upi.processPayment(0);
	}

}
