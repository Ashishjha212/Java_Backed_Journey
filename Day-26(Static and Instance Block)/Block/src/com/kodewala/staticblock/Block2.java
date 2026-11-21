package com.kodewala.staticblock;
class Test{
	static {
		System.out.println("static");
	}
	{
		System.out.println("Instance");
	}
	Test(){
		System.out.println("Constructor");
	}
}
public class Block2 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(".....");
		Test t2 = new Test();

	}

}
