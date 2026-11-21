package com.kodewala.exception;

public class Driver6 {
	int m1(int a) {
		System.out.println("m1 in hello");
		int x=10;
		try {
			System.out.println("in try of m1");
			 x = 10 / a;
			//System.out.println("x=" + x);
			return x;
		} catch (Exception e) {
			System.out.println("in catch of m1");
			e.printStackTrace();
		} finally {
			System.out.println("in finally...very important code");
			 x=6;
			return x;
		}
		//System.out.println("After catch block in m1");
		//return 99;
	}

	int m2(int a) {
		System.out.println("m2(int a) in Hello");
		try {
			System.out.println("in m2(int a) try block");
			int x = 10 / a;
			return 5;
		} catch (ArithmeticException e) {
			System.out.println("In catch of m2");
			e.printStackTrace();
		} finally {
			System.out.println("Very important code in finally of m2");
			
		}
		System.out.println("Out of catch in m2");
		return 10;
		
	}

	public static void main(String[] args) {
		Driver6 driver6 = new Driver6();
		int result = driver6.m1(0);
		System.out.println(result);
		//driver6.m2(Integer.parseInt(args[1]));
	}

}
