package com.kodewala.Interface;

public class UPIPayments implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("Paid" +amount + "Via UPI");
		
	}

}
