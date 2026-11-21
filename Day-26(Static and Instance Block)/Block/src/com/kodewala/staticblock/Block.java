package com.kodewala.staticblock;

public class Block {
	static {
		System.out.println("static Block");
	}
	{
		System.out.println("Instance Block");
	}
	Block(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		Block b1 = new Block();
		Block b2 = new Block();

	}

}
