package com.kodewala.string;

public class StringPractice {

	public static void main(String[] args) {
		String str = "Ashish";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		String name = "ashISH";
		System.out.println(name.equals(str));
		System.out.println(name.equalsIgnoreCase(str));
		String str1= "        ";
		System.out.println(str1.length());
		System.out.println(str1.isEmpty());
		//System.out.println(str1.isBlank());
		String name1 = "  Ashish    ";
		System.out.println(name1.length());
		name1 = name1.trim();
		System.out.println(name1.length());
		String name2 = "Ashish";
		System.out.println(name2.toUpperCase());
		String name3 = "ASHIasjhb";
		System.out.println(name3.toLowerCase());
		String name4 = "My name is Ashish jha";
		System.out.println(name4.substring(3, 12));
		System.out.println(name4.contains("jhA"));
		int num=1234;
		String st = String.valueOf(num);
		System.out.println(num+1);
		System.out.println(st+1);
		String name11 = "Ashish is playing cricket";
		System.out.println(name11.startsWith("Ashish i"));
		System.out.println(name11.endsWith("cricket"));
		
		String name5 = "Ashish";
		char crr[] = name5.toCharArray();
		for(char ch: crr) {
			System.out.println(ch);
		}
		String name6= "My, name, is, Ashish";
		String[] result = name6.split(",");
		for(String s:result) {
			System.out.println(s);
		}
		String name7 = "Babber";
		String z = name7.replace('b', 'z');
		System.out.println(z);
		
		
	}

}
