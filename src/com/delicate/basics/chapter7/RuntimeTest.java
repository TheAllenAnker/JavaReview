package com.delicate.basics.chapter7;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Processors count: " + rt.availableProcessors());
        System.out.println("Available memory: " + rt.freeMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Max available memory count: " + rt.maxMemory());
    }
}
