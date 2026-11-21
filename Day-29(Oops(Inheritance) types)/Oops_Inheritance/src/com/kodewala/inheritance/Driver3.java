package com.kodewala.inheritance;

class Person {

	String name = "Ashish";

	public Person(String name) {
		super();
		this.name = name;
	}

	void displayName() {
		System.out.println("Name: " + name);
	}
}

class Employee extends Person {

	int employeeId = 101;

	public Employee(String name, int employeeId) {
		super(name);
		this.employeeId = employeeId;
	}

	void displayEmployeeId() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeId);
	}
}

class Developer extends Employee {

	String language = "Java";

	public Developer(String name, int employeeId, String language) {
		super(name, employeeId);
		this.language = language;
	}

	void displayLanguage() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Language: " + language);
	}
}

public class Driver3 {

	public static void main(String[] args) {
		Developer d = new Developer("Ashish", 1234, "Java");
		 
		d.displayLanguage();

	}

}
