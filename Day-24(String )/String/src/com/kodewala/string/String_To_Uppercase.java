package com.kodewala.string;

public class String_To_Uppercase {

	public static void main(String[] args) {
		String name = "my name is ashish kumar i am from bihar";
		String result = "";
		for(int i=0; i<name.length(); i++) {
			char ch =name.charAt(i);
			if(ch>='a' && ch<='z'){
				ch = (char)(ch-32);
				System.out.println(ch);
			}
			
			result = result+ch;
		}
		System.out.println(result);
		

	}

}
