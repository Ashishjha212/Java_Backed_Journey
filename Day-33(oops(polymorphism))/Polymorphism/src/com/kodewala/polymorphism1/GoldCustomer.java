package com.kodewala.polymorphism1;

public class GoldCustomer extends Customer {
	@Override
	public void processOrder() {
		System.out.println("GoldCustomer.processOrder().....GoldCustomer");
	}

}
