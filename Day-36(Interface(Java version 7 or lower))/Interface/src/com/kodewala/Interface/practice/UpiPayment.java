package com.kodewala.Interface.practice;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment through upi "+amount);
		
	}
	

}
