package com.kodewala.polymorphism;

public class Order {
	 private int orderId;
	    private Product product;
	    private int quantity;
	    private String status;

	    public Order(int orderId, Product product, int quantity) {
	        this.orderId = orderId;
	        this.product = product;
	        this.quantity = quantity;
	        this.status = "CREATED";
	    }

	    public double calculateTotal() {
	        return product.getPrice() * quantity;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void displayOrder() {
	        System.out.println("\n----- ORDER DETAILS -----");
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Product: " + product.getProductName());
	        System.out.println("Price: Rs. " + product.getPrice());
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Amount: Rs. " + calculateTotal());
	        System.out.println("Order Status: " + status);
	    }
}
