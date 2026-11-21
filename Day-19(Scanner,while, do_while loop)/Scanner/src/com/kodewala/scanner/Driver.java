package com.kodewala.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creates connection with console
		
		System.out.println("please enter the name....");
		String name = sc.nextLine();//reading String input
		
		System.out.println("please enter product price");
		int price =  sc.nextInt();
		
		sc.nextLine();//consume the extra char
		System.out.println("pls enter delivery address..");
		String address = sc.nextLine();
		
		System.out.println("Name is:"+name);
		System.out.println("Price is:"+price);
		System.out.println("Address is:"+address);
		
		sc.close();

	}

}
