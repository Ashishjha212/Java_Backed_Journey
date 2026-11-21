package com.hotstar.user;

public class Driver {

	public static void main(String[] args) {
		for(int i=0; i<5000; i++) {
			User user = new User("Guest","Free");
		}
//		User user0 = new User("As123", "Abhinav", "Paid");
//		User user1 = new User("Ab123", "Ashish", "Paid");
//		User user2 = new User("Rj123", "Rajnish", "Paid");
//		User user3 = new User("Ro123", "Rohit", "Paid");
//		User user4 = new User("Mo123", "Mohit", "Paid");
//		User user5 = new User("Ay123", "Ayush", "Paid");
//		
//		User user6 = new User("guest", "Free");
//		User user7 = new User("guest", "Free");
		System.out.println("The totalcount of user is "+User.liveUserCount);
		
		
		
	}

}
