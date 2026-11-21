package com.kodewala.string;

public class StringBasics {

	public static void main(String[] args) {
		String firstName="Ashish";
		for(int i=0; i<=firstName.length()-1; i++) {
			System.out.println(firstName.charAt(i));
		}
		String lastName="Jha";
		System.out.println(firstName +" "+ lastName);
		System.out.println(firstName.length());
		System.out.println(firstName.charAt(5));
		//System.out.println(firstName[3]);
		

	}

}
