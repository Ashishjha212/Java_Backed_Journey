package com.kodewala.string;

public class Driver3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala");
		StringBuilder sb1 = new StringBuilder("Kodewala");
		System.out.println(sb==sb1);
		
		for (int i = 0; i <= 10; i++) {
		//	sb.append(" Academy" + i);
		}
		System.out.println(sb.equals(sb1));
		System.out.println(sb.toString().equals(sb1.toString()));

	}

}
