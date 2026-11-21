package com.kodewala.constructor1;

public class Person {
	Person() {
		System.out.println("Person Constructor");
	}

}

class Employee extends Person {
	Employee() {
		super();
		System.out.println("Employee constructor");
	}
}
