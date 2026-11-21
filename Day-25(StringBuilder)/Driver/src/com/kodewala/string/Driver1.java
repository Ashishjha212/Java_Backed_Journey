package com.kodewala.string;

public class Driver1 {

	public static void main(String[] args) {
		QueryGenerator generator = new QueryGenerator();
		StringBuilder result = generator.generateQuery(0, " Aj123");
		System.out.println(result);
	}

}
