package com.kodewala.Interface;

public interface IBooking {
	public void book();
	public void cancelBooking();
	public void checkStatus();
	public void search();
	//Optional
	public default void autoUpgrade() {
		 connecttoDB();
		System.out.println("IBooking.autoUpgrade()");
		
	}
	public default void sendNotification() {
		 connecttoDB();
		System.out.println("IBooking.sendNotification()");
		
	}
	private void connecttoDB() {
		System.out.println("IBooking.connectDB()");
	}
	//common or utility method
	public static void printTicket(String path,String Contents) {
		//connecttoDB();
		System.out.println("Printing ticket static method.....");
	}

}
