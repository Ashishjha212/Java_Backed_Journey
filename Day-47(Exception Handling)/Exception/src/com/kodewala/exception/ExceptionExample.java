package com.kodewala.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {

			String user = "Kodewala";
			if (user.equals("Kodewala")) {
				throw new UserAlreadyExists("User already exists in the system");
			}

		} catch (UserAlreadyExists e) {
			System.out.println(e.getMessage());
		}

	}
}
