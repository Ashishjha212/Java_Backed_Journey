package com.kodewala.staticblock;
class B{
	static {
		System.out.println("Static B");
	}
	{
		System.out.println("Instance B");
	}
	B(){
		System.out.println("Constructor B");
	}
}
public class Block3 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		B obj = null;
		System.out.println("Main End");

	}

}
