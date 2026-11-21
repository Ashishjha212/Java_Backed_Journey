package com.kodewala.abstraction;

public class Account {
	// Responsible for opening an account
	public boolean openAccount(String name, String address, String pan) {
		validateNameAndAddress(name, address);
		validatePan(pan);
		findAccountByPanCard(pan); //enhanced 
		createUserId();
		connectWithDb();
		notifyUser();
		
		return true;
	}
		//Core functionality
	private boolean validateNameAndAddress(String name, String address) {
		System.out.println("Account.validateNameAndAddress().........Validating name and address");
		return true;
	}
	//Core functionality
	private boolean validatePan(String pan) {
		System.out.println("Account.validatePan().........Validating pan");
		return true;
	}
	//Core functionality
	private void connectWithDb() {
		System.out.println("Account.connectWithDb().........DB Connection");
	}
	//Core functionality
	private String createUserId() {
		System.out.println("Account.createUserId().........creating userId");
		return "Some user id......";
	}
	//Core functionality
	private void notifyUser() {
		System.out.println("Account.notifyUser()..........sending notification to user");
	}
	private int findAccountByPanCard(String pan) {
		System.out.println("Account.findAccountByPanCard()...........finding total account");
		return 3;
	}

}
