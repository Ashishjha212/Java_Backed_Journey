package com.kodewala.Interface;

public class Driver {

	public static void main(String[] args) {
		IAccount1 account = (name,address,amount)->
		{
			System.out.println("Opening Account "+name);
			System.out.println("Current address is "+address);
			System.out.println("Amount is "+amount);
			
			return "Account opened for Ashish";
		};
		String res =account.openAccount("Ashish", "Bengaluru", 100000);
		System.out.println(res);
	}

}
