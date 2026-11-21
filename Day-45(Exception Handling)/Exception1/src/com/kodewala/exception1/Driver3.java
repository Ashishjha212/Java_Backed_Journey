package com.kodewala.exception1;

public class Driver3 {

	public static void main(String[] args) {
		String name=null;
		int arr[] = {10,20,30};
		try {
			System.out.println(name.length());
			System.out.println(arr[10]);
			System.out.println("End of try block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access invalid index");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("you are accessing through null value");
			e.printStackTrace();
		}

	}

}
