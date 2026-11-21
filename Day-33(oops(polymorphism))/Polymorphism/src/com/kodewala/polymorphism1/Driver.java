package com.kodewala.polymorphism1;

public class Driver {

	public static void main(String[] args) {
		ProcessOrder processOrder = new ProcessOrder();
		GoldCustomer goldCustomer = new GoldCustomer();
		processOrder.processOrder(goldCustomer);
		
		SilverCustomer silverCustomer = new SilverCustomer();
		processOrder.processOrder(silverCustomer);
	}

}
