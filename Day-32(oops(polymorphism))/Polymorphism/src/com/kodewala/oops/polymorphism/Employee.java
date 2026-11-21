package com.kodewala.oops.polymorphism;

public class Employee {
	public void markIn() {
		System.out.println("Employee Markin().....Employing marking");
	}
	
}

	 class HrManager extends Employee {
		@Override
		public void markIn() {
			System.out.println("HrManager Markin().....HrManager marking");
		}
	}


