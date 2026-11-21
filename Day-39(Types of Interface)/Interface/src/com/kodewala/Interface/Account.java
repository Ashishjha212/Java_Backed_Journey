package com.kodewala.Interface;

public class Account implements Cloneable { //Giving permission so that object of this class can be copied/cloned
	String name;
	String accNo;
	String address;

	public Account(String name, String accNo, String address) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
