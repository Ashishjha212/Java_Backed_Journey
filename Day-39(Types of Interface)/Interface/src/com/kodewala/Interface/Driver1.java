package com.kodewala.Interface;

public class Driver1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc = new Account("Ashish", "3455643333444", "Bengaluru");
		Account cloneObjOfAcc = (Account) acc.clone(); // trying to clone it(xerox/copy)
		System.out.println(cloneObjOfAcc.accNo);
		if (acc instanceof Cloneable) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

	}

}
