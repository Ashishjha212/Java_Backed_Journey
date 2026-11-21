package com.kodewala.exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int arr[] = { 5, 12, 33, 87 };
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index! Array size is only" + arr.length);
			e.printStackTrace();
			System.out.println("Program continues after handling the exception");
		}

	}

}
