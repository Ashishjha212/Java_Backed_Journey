package com.kodewala.loop;

public class Array {

	public static void main(String[] args) {
		String cities[] = new String[7];
		cities[0] = "Bangalore";
		cities[1] = "Delhi";
		cities[2] = "Goa";
		cities[3] = "Chennai";
		cities[4] = "UP";
		cities[5] = "Dhanbad";
		cities[6] = "Dehradun";
		for (int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("D")) {
				System.out.println("cities start with D are  :"+cities[i]);
				
			}

		}

	}

}
