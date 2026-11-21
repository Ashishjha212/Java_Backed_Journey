package com.kodewala.staticblock;

public class Main {
	static {
		System.out.println("Static block executes");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
	}

}
