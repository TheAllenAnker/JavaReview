package com.delicate.basics.chapter6;

interface Product {
    double getPrice();

    String getName();
}

public class AnonymousTest {
    public void test(Product p) {
        System.out.println("Bought a " + p.getName() + ", spent " + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product() {
            @Override
            public double getPrice() {
                return 1999.9;
            }

            @Override
            public String getName() {
                return "Nvida GPU";
            }
        });
    }
}
