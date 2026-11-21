package com.kodewala.Heap;

public class HeapDump {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Maximum Heap: "
                + runtime.maxMemory() / (1024 * 1024) + " MB");

        System.out.println("Total Heap: "
                + runtime.totalMemory() / (1024 * 1024) + " MB");

        System.out.println("Free Heap: "
                + runtime.freeMemory() / (1024 * 1024) + " MB");
    }
}

