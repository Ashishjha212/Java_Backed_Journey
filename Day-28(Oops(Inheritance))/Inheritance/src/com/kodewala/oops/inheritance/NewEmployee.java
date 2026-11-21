package com.kodewala.oops.inheritance;

public class NewEmployee {
	String name;
	int employeeId;
	double salary;

	public NewEmployee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println(name);
		System.out.println(employeeId);
		System.out.println(salary);
	}

}
