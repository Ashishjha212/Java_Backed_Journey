package com.kodewala.polymorphism1;

public class PremiumCustomer extends Customer {
	@Override
	public void processOrder() {
		System.out.println("PremiumCustomer.processOrder().....PremiumCustomer");
	}

}
