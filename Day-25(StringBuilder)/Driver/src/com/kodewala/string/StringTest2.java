package com.kodewala.string;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		s2.intern();
		System.out.println(s1==s2);
	}

}
