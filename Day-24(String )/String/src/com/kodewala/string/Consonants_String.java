package com.kodewala.string;

public class Consonants_String {

	public static void main(String[] args) {
		String name ="My name is Ashish kumar";
		name = name.toLowerCase();
		int count=0;
		for(char ch:name.toCharArray()) {
			if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
