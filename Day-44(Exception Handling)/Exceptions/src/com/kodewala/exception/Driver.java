package com.kodewala.exception;

class Account {

}

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()...START");
		String name = null;
		int amount = 100;
		try {
			int part = 0;
			int total = amount / part;
			System.out.println(name.length());
			System.out.println(total);
		} catch (NullPointerException e) {
			System.out.println("Name is null");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("amount cannot be/by zero");
			e.printStackTrace();
			System.out.println("Driver end");
		}

	}

}
