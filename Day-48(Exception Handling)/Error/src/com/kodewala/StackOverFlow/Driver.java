package com.kodewala.StackOverFlow;

public class Driver {
	public void m1() {
		System.out.println("m1() method");
		m2();
	}
	public void m2() {
		System.out.println("m2() method");
		m1();
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.m1();

	}

}
