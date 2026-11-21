package com.kodewala.polymorphism;

public class CreditCardPayment extends Payment {

    @Override
    public void doPayment(double amount) {
        System.out.println( "Payment of Rs. " + amount + " completed using Credit Card." );
    }

}
