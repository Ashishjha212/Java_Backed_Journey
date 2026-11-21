package com.kodewala.scan;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 5;
		int userEntered = 2;
		
		while(luckyNumber != userEntered  ) {
			
			System.out.println("Enter the number");
			int userEntered1= sc.nextInt();
		
			if(userEntered1 == luckyNumber) {
				System.out.println("guess is correct");
			}
			else {
			System.err.println("please try again");
			}
		}

	}

}
