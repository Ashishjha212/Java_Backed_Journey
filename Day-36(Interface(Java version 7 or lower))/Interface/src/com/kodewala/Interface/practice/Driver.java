package com.kodewala.Interface.practice;

public class Driver {

	public static void main(String[] args) {
		Payment payment =  new UpiPayment();
		payment.pay(500.0);
	}

}
