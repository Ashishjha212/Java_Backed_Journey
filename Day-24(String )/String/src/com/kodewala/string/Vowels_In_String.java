package com.kodewala.string;

public class Vowels_In_String {

	public static void main(String[] args) {
		String str = "Ashish kumar Jha";
		int vowelCount = 0;
		str = str.toLowerCase();
		for(char c:str.toCharArray()) {
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
				vowelCount++;
			}
			
		}
		System.out.println(vowelCount);
		

	}
}
