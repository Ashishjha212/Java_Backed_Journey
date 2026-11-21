package com.kodewala.Interface;

public interface PaymentGateway {
	default void validateTransaction() {
		log("validating transaction");
		System.out.println("Transaction validated!");
	}
	static void checkServiceStatus() {
		log("Payment service is active");
	}
	private static void log(String message) {
		System.out.println("[LOG]" +message);
	}
	void processPayment(double amount);

}
