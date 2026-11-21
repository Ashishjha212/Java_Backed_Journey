package com.kodewala.oops.overloading;

public class Login {
	public void doLogin(String mobile, int otp) {
		System.out.println("Login.doLogin(String mobile,int Otp)");
		System.out.println(mobile+ " " +otp);

	}
	public void doLogin(String gmail) {
		System.out.println("Login.doLogin(String gmail)");
		System.out.println(gmail);

	}
	public void doLogin(String mobile, String  password) {
		System.out.println("Login.doLogin(String mobile,String Password)");
		System.out.println(mobile+  " "+password);

	}

}
