package com.kodewala.oops.inheritance;

public class Manager extends Employee // Manager IS-A Employee
{
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		markIn(empCode);
	}
}
