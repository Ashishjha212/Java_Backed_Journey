package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		//create a String Object
		String firstName = "Kodewala";//Obj created in SCP --> firstName's address --> xyz321
		String lastName = "Kodewala";//Obj with Content "Kodewala" already created
										//and lastName will refer to exsiting Object.
										//lastName is also pointing to address xyz321
		
		System.out.println(firstName==lastName);// ==will compare address of an object.
	

	}

}
