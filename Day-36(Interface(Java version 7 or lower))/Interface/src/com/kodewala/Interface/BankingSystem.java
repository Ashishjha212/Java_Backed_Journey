package com.kodewala.Interface;

public class BankingSystem {

	public static void main(String[] args) {
		BankServices bankServices = new Customer();
		bankServices.applyLoan(200000.0);
		bankServices.deposit(10000.0);
	}

}
