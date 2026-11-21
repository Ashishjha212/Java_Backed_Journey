package com.kodewala.exception;

public class Driver2 {

	public static void main(String[] args) {

		String name = null;
		System.out.println(name.length());

		String classname = "com.kodewala.exception.Driver2";
		try {
			Class.forName(classname); //loading the class into memory
			System.out.println(" class Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
