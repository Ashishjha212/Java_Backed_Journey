package com.kodewala.string;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Spring");
		String s2 = s1.intern();
		System.out.println(s1==s2);
		System.out.println(s2=="Spring");

	}

}
