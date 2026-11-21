package com.kodewala.string;

public class StringEqual {

	public static void main(String[] args) {
		String name1 = "Ashish";
		String name2 = "AshisH";
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("String are equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
