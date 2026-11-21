package com.kodewala.exception1;

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("A");
		try {
			System.out.println("B");
			int result=10/0;
			System.out.println("C");
		}
		catch(ArithmeticException e) {
			System.out.println("D");
		}
		System.out.println("E");

	}

}
