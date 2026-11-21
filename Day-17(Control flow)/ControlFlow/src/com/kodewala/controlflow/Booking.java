package com.kodewala.controlflow;

/*
	The class is responsible for accepting booking from user
*/
public class Booking {
	// More then 6 passenger per PNR is not allowed
	public String doBooking(String from, String to, int noOfPass) {
		String pnr = null;
		if (noOfPass > 6) { // If this condition is true then only below code is executed
			// Do not allow to book
			System.err.println("As per IRCTC policy, only  passenger are allowed per PNR");
			

		}
		else {
			//Confirming the booking
			pnr = "3457889";
			System.out.println("Confirming the booking:"+pnr);
			System.out.println("Status : Confirmed");
			System.out.println("Seat : 23 A1");
		}
		// If above condition is false then execution continues
		return pnr;
	}

}
