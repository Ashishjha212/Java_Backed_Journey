package com.kodewala.Interface;

public class Googlepay implements Payment{
	@Override
	public void pay() {
		System.out.println("Google pay Processing");
	}

}
