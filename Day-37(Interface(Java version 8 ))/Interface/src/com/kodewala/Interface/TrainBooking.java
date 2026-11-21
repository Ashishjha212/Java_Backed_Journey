package com.kodewala.Interface;

public class TrainBooking implements IBooking {

	@Override
	public void book() {
		System.out.println("TrainBooking.book()");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainBooking.cancelBooking()");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("TrainBooking.checkStatus()");
		
	}

	@Override
	public void search() {
		System.out.println("TrainBooking.search()");
		
	}
	void printTrainTicket(String path,String contents) {
		IBooking.printTicket(" ", " ");
	}
}
