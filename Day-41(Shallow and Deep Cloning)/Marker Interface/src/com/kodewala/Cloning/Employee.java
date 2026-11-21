package com.kodewala.Cloning;

public class Employee implements Cloneable {
	String id;
	String name;
	Address address;
	public Employee(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	

}
