package com.kodewala.string;

public class Frequency_String {

	public static void main(String[] args) {
		String name = "Ashutosh";
		char ch ='h';
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(ch==name.charAt(i)) {
				count++;
			}
			
			
		}
		System.out.println("The character:"+count );
		
	}

}
