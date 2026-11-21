package com.kodewala.string;

public class Driver1 {

	public static void main(String[] args) {
		String s = "Kodewala";
		//in case i want to change s
		String s2 = s.concat(" Academy");//trying to change the object
					//Object created in heap with content kodewala Academy
		System.out.println(s2);
		
		

	}

}
