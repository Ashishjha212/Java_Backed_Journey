package com.kodewala.staticblock;

class C {
	static {
		System.out.println("Static block C");
	}
	static   int x = 10;
	
}

public class Block4 {

	public static void main(String[] args) {
		System.out.println(C.x);
	}

}
