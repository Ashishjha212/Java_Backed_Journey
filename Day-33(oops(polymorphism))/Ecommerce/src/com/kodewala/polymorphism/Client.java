package com.kodewala.polymorphism;


public class Client {

    public static void main(String[] args) {

        // Step 1: Create product
        Product product = new Product(
            101, "Wireless Headphones", 1500.00
        );

        // Step 2: Create order for 2 products
        Order order = new Order(5001, product, 2);

        // Step 3: Create payment processor
        PaymentProcessor processor = new PaymentProcessor();

      

     

    }
}
