package com.kodewala.abstraction;

public class Order {

	//Exposed functionality
	public void placeOrder(String name, String address) {
		
			validateOrder(name,address);
			processPayment();
			updateInventory();
			orderSuccessful();
		

	}

	//Core functionality-hidden implementation
	private void validateOrder(String name, String address) {
		System.out.println("Name is :"+name+ "   " +"Address is :"+address);
		System.out.println("Validating order...");
	}

	private void processPayment() {
		System.out.println("Processing payment...");
	}

	private void updateInventory() {
		System.out.println("Updating inventory...");
	}
	private void orderSuccessful() {
		System.out.println("OrderSuccessful........");
	}

}

