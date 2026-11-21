package com.kodewala.Interface1;

public class Driver1 {

	public static void main(String[] args) {
		BankService services = new SBI();
		services.deposit();
		services.withdraw();
		

	}

}
