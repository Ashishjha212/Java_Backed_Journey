package com.kodewala.oops.polymorphism;

public class Driver2 {

	public static void main(String[] args) {
		Person person;
		person=new Student();
		person.showRole();
		person=new Boyfriend();
		person.showRole();

	}

}
