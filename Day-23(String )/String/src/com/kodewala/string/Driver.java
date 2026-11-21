package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = new String("Academy");
		
		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");
		
		System.out.println(s4.equals(s1));
		System.out.println(s4.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s4.intern()==s1);
		System.out.println(s4==s1);
		System.out.println(s2=="Academy");
	}

}
