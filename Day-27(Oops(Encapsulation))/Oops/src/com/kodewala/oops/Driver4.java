package com.kodewala.oops;

public class Driver4 {

	public static void main(String[] args) {
		Employee employee = new Employee("Ashish", 20000);
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getSalary());
		employee.setSalary(-3000);
		System.out.println(employee.getSalary());
		System.out.println(employee.getSalary());

	}

}
