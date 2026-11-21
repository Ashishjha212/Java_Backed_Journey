package com.kodewala.Heap;

public class WhileLoop {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        System.out.println("Total Heap: "
                + r.totalMemory() / (1024 * 1024) + " MB");

        System.out.println("Maximum Heap: "
                + r.maxMemory() / (1024 * 1024) + " MB");

        System.out.println("Free Heap: "
                + r.freeMemory() / (1024 * 1024) + " MB");
    }
}