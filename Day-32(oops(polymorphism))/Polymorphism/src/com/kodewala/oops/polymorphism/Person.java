package com.kodewala.oops.polymorphism;

public class Person {
	void showRole() {
		System.out.println("I am a person with multiple roles. ");

	}

}
class Student extends Person{
	@Override
	void showRole() {
		System.out.println("I am a student I study and attend classes");

	}
}
class Boyfriend extends Person{
	@Override
	void showRole() {
		System.out.println("I am a boyfriend  I spend time with my partner");

	}
}
