package com.kodewala.string;

public class StringTest4 {

	public static void main(String[] args) {
		String a ="Java";
		String b ="Ja";
		String c=b+"va";
		System.out.println(a==c);
		System.out.println(a==c.intern());

	}

}
