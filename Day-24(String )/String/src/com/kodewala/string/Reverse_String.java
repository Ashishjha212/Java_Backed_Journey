package com.kodewala.string;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "Ashish";
		char[] chars = name.toCharArray();
		for(int i = chars.length-1; i>=0; i--) {
			System.out.println(chars[i]);
		}

	}

}
