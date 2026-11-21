package com.kodewala.oops.polymorphism;

public class Driver1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.markIn();
		HrManager hr = new HrManager();
		hr .markIn();
		HrManager hr1 =(HrManager) e1;
		
		//System.out.println(hr.hashCode());
		
	}

}
