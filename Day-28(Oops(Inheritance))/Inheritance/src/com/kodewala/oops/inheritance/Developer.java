package com.kodewala.oops.inheritance;

public class Developer extends NewEmployee{
	String programmingLanguage;

	public Developer(String name, int employeeId, double salary, String programmingLanguage) {
		super(name, employeeId, salary);
		this.programmingLanguage = programmingLanguage;
	}
	public void writeCode() {
		System.out.println(name);
		System.out.println(employeeId);
		System.out.println(salary);
		System.out.println(programmingLanguage);
		System.out.println("Developer is writing code");
	}

}
