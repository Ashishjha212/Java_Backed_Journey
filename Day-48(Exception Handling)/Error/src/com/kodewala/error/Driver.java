package com.kodewala.error;

public class Driver {

	public static void main(String[] args) {
		try {
			throw new OutOfMemoryError();
		} catch (Throwable  e) {
			System.out.println("Caught");
		}

	}

}
