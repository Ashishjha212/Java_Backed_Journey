package com.kodewala.oops.polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {
		Registration reg = new Registration();
		reg.doRegistration("AZR345677");
		reg.doRegistration("8796754567", 897689);
		reg.doRegistration("Ashish", "Aj123@gmail.com");
		reg.doRegistration(234567, "7867935665");

	}

}
