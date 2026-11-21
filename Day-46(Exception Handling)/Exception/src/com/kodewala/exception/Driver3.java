package com.kodewala.exception;

public class Driver3 {

	public static void main(String[] args) {
		System.out.println("Driver3");
		try {
			int i = Integer.parseInt(args[0]);
			int i1 = 10 / i;
			System.out.println(i1);
		} catch (Exception e) {
			System.out.println("In catch....");
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("please provide the value..." + e);
			} else if (e instanceof NumberFormatException) {
				System.out.println("please provide numeric value" + e);
			}
		}

	}

}
