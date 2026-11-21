package com.kodewala.string;

public class StringTest1 {

	public static void main(String[] args) {
		String s = new String("Ja") + new String("va");
		s=s.intern();
		String s1 = "Java";
		System.out.println(s==s1);

	}

}
