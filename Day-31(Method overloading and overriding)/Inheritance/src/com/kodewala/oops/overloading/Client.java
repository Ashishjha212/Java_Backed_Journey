package com.kodewala.oops.overloading;

public class Client {

	public static void main(String[] args) {
		Login login = new Login();
		login.doLogin("8765986754", 9087656);
		login.doLogin("Aj123456@#");
		login.doLogin("6789450987", "Aj1234hg9u");

	}

}
