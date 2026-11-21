package com.kodewala.scan;

public class Driver2 {

	public static void main(String[] args) {
		String cities[] = { "Delhi", "Mumbai", "Bangalore", "Chennai", "Bangalore", "Hyderabad", "Pune", "Ahmedabad",
				"Jaipur", "Lucknow", "Bangalore", "Bhopal", "Bangalore", "Chandigarh", "Noida", "Gurgaon", "Ranchi",
				"Bhubaneswar", "Kochi", "Varanasi" };
		
		for(int i=0; i<cities.length; i++) {
			String currentCities = cities[i];
			if(currentCities.equals("Bangalore")) {
				System.out.println("Bangalore is the part of city");
				break;
			}
		}
	}

}
