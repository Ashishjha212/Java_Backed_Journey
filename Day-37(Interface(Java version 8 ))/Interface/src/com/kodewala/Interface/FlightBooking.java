package com.kodewala.Interface;

public class FlightBooking implements IBooking {

	@Override
	public void book() {
		System.out.println("FlightBooking.book()");
		
	}

	@Override
	public void cancelBooking() {
		
		System.out.println("FlightBooking.cancelBooking()");
	}

	@Override
	public void checkStatus() {
		System.out.println("FlightBooking.checkStatus()");
		
	}

	@Override
	public void search() {
		System.out.println("FlightBooking.search()");
		
	}
	void printFlightTicket(String path,String contents) {
		IBooking.printTicket(" ", " ");
	}
	

}
