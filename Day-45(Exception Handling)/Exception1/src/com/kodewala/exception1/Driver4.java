package com.kodewala.exception1;

public class Driver4 {

	public static void main(String[] args) {
		try {
			int age = Integer.parseInt(args[0]);
			System.out.println("Age is:"+age);
		}
		catch(NumberFormatException t) {
			System.out.println("you are trying to convert int into String not valid ");
			t.printStackTrace();
		}
		
		

	}

}
