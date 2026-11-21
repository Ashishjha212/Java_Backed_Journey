package com.kodewala.scan;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creates connection with console
		System.out.println("Please enter the name");
		String name = sc.nextLine(); //reading string input
		System.out.println("Name is :"+name);
		System.out.println("Enter the price");
		int price = sc.nextInt();
		sc.nextLine(); //consume the extra character
		System.out.println("price is:"+price);
		System.out.println("Enter delivery address");
		String address = sc.nextLine();
		System.out.println("Address is:"+address);
		
		sc.close(); //close the connection
	}

}
