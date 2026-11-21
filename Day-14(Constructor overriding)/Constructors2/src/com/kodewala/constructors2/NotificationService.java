package com.kodewala.constructors2;

public class NotificationService {
	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification() ");
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
			
  		}else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
			
		}else {
			sendWattsup();
			
		}
	}
	
	private void sendSMS() {
		System.out.println("NotificationService.sendSMS() START");
		
		System.out.println("NotificationService.sendSMS() END");
		
	}
	
	private void sendEmail() {
		System.out.println("NotificationService.sendEmail() START");
		
		System.out.println("NotificationService.sendEmail() END");
		
	}
	
	private void sendWattsup() {
		System.out.println("NotificationService.sendWattsup() START");
		
		System.out.println("NotificationService.sendWattsup() END");
	}

}
