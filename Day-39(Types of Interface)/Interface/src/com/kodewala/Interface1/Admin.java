package com.kodewala.Interface1;

public class Admin implements PremiumUser{
public static void main(String[] args) {
		PremiumUser premiumUser = new Admin();
		if(premiumUser instanceof Admin) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
