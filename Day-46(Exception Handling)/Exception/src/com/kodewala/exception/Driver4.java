package com.kodewala.exception;

public class Driver4 {

	public static void main(String[] args) {
		int a=10;
		try {
			int b=Integer.parseInt(args[0]);
			int c=a/b;
		}catch(NumberFormatException e) {
			System.out.println("please provide number value"+e);
		}catch(ArithmeticException e) {
			System.out.println("please provide non-zero value"+e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please provide some value"+e);
		}catch(NullPointerException e) {
			System.out.println("Trying exception type...."+e);
		}catch(Exception e) {
			System.out.println("Boss of all exception"+e);
		}
 
	}

}
