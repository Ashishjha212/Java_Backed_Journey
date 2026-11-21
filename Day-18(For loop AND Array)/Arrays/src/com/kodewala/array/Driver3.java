package com.kodewala.array;

public class Driver3 {

	public static void main(String[] args) {
		User user1 = new User("Kodewala","9876543209");
		User user2 = new User("Ashish","987654709");
		User user3 = new User("Rohit","9876543308");
		User user4 = new User("Pradeep","7866543209");
		User user5 = new User("Vijay","9856743209");
		
		//Stores User object in an array
		User users[] = new User[5];
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		users[3]=user4;
		users[4]=user5;
		System.out.println(users[0].name+ " "+users[0].mobile);
		
		
	}

}
