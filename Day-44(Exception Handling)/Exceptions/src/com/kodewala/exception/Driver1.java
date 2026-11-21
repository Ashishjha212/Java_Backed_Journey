package com.kodewala.exception;
class Account1{
	
}
public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver1. start");
		String name = null;
		try {
			System.out.println(name.length());
		}catch(NullPointerException e){
			System.out.println("Name is null");
			e.printStackTrace();
		}
		System.out.println("Driver1.end");
	}

}
