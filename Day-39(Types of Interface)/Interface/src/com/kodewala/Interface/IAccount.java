package com.kodewala.Interface;

@FunctionalInterface
public interface IAccount extends IAccountMgmt{
	
	void openAccount(); //One abstract method - SAM + one abstract from IAccountMgmt

	default void addBeni() {

	}
	private void client() {
		
	}
	static void customer() {
		
	}

}

