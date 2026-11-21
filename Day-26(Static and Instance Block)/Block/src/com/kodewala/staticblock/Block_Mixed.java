package com.kodewala.staticblock;
class A1{
	static int x=10;
	static {
		x=x+5;
		System.out.println("static A"+x);
	}
	{
		x=x+2;
		System.out.println("Instance A"+x);
	}
	A1(){
		x=x+3;
		System.out.println("Constructor A"+x);
	}
}
public class Block_Mixed {

	public static void main(String[] args) {
		A1 obj1 = new A1();
		A1 obj2 = new A1();
		System.out.println("Final x"+A1.x);
		
	}

}
