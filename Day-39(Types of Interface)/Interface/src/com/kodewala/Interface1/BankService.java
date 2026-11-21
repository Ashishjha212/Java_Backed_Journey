package com.kodewala.Interface1;

public interface BankService {
	default void deposit() {
		validate();
		System.out.println("Total amount deposit");
	}
	default void withdraw() {
		validate();
		System.out.println("Amount withdraw");
	}
	private void validate() {
		System.out.println("Validate the amount");
		System.out.println("Amount should be greater then 0");
	}

}
