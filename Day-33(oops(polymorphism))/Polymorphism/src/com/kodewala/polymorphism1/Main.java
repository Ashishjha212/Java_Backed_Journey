package com.kodewala.polymorphism1;

class Main {
	public static void main(String[] args) {
		User u = new Admin();
		// Admin a = (Admin)new User();
		Admin a1 = (Admin) u;
		Admin a2 = (Admin) new Admin();

	}
}
