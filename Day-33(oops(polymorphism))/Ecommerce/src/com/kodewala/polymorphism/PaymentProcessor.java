package com.kodewala.polymorphism;



public class PaymentProcessor {

    public boolean processPayment(Payment payment, double amount) {

        if (payment == null || amount <= 0) {
            System.out.println("Invalid payment details.");
            return false;
        }

        payment.doPayment(amount);

        return true;
    }
}
