package com.kodewala.exception;

public class Driver7 {
	int m1() {
		System.out.println("m1 in Hello");
		try {
			int x=10/2;
			return 5;
		}catch(Exception e) {
			e.printStackTrace();
			return 20;
		}finally {
			System.out.println("In finally");
			return 30;
		}
		
	}

	public static void main(String[] args) {
		Driver7 driver7 = new Driver7();
		int a =driver7.m1();
		System.out.println(a);

	}

}
