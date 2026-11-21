package com.kodewala.string;

public class StringSplit {

	public static void main(String[] args) {
		String str = "Kodewala,Bangalore,Btm,2nd stage";
		String[] result = str.split(",");
		for(String res:result) {
			System.out.println(res);
		}

	}

}
