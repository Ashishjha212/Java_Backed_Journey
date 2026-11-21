package com.kodewala.array;

public class Driver2 {

	public static void main(String[] args) {
		Account account1 = new Account("Ashish", "6785633737", "786373737373");
		Account account2 = new Account("Abhinav", "6785667837", "786678737373");
		Account account3 = new Account("Raj", "6785636787", "987373737373");
		Account account4 = new Account("Rajnish", "88775633737", "784673737373");
		Account account5 = new Account("Rohit", "6786783737", "956373737373");
		
		Account account[] = new Account[5];
		account[0] = account1;
		account[1] = account2;
		account[2] = account3;
		account[3] = account4;
		account[4] = account5;
		
		System.out.println(account[0]);
		System.out.println(account[1]);
		System.out.println(account[2]);
		System.out.println(account[3]);
		System.out.println(account[4]);
		
		
	}

}
