package com.kodewala.exception;

public class InvoiceService {
	public void generateInvoice() {
		try {
			connectDatabase(); //creating connection
			String name="Rana";
			name.lastIndexOf("a");
			//get customers and orders details from database
			//connect with database --> create db connection
			//get details from db
			System.out.println("Generating an invoices....");
			System.exit(0); //killing JVM
			//closing
			closeDbConnection();
		}catch(Exception e) {
			System.out.println("Some exception");
			e.printStackTrace();
		}
		finally { //Mandatory executable block (Exception or No-Exception)
			System.out.println("I am inside finally block.....");
			
		}
	}
	private void connectDatabase() { //Database connection object
		System.out.println("Connect to DB");
	}
	private void closeDbConnection() {
		System.out.println("Closing connection");
	}

}
