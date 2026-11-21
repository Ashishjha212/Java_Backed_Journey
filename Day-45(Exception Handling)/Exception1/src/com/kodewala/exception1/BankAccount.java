package com.kodewala.exception1;

public class BankAccount {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int arr[]= {23,5,6,7};
			System.out.println(arr[4]);
			int result=a/b;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access invalid index");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("number divided by 0 is not valid");
			e.printStackTrace();
		}
	
		
	}

}
