package com.kodewala.string;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String name="  my 	name	    is  		 ashish   "
				+ " i am from      "
				+ " bihar";
		String s = name.replaceAll("\\s", "");
		System.out.println(s);

	}

}
