package com.delicate.basics.chapter6;

abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device d) {
        System.out.println("Bought a " + d.getName() + ", spent " + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("Nvida GPU") {
            @Override
            public double getPrice() {
                return 2999.9;
            }
        });
        Device d = new Device() {
            {
                System.out.println("Anonymous Inner Class Initialization Block");
            }

            @Override
            public double getPrice() {
                return 1999.9;
            }

            @Override
            public String getName() {
                return "GPU";
            }
        };
        ai.test(d);
    }
}
