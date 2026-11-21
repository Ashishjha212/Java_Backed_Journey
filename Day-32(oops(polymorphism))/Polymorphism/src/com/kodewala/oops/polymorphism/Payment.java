package com.kodewala.oops.polymorphism;

public class Payment {
	void processPayment(double amount) {
		System.out.println("Processing generic payment of rupees"+amount);
	}

}
class UPIPayment extends Payment{
	@Override
	void processPayment(double amount) {
		System.out.println("Processing UPI payment of rupees " +amount);
	}
}
class CCPay extends Payment{
	@Override
	void processPayment(double amount) {
		System.out.println("Processing Credit Card Payment of rupees " +amount);
	}
}
