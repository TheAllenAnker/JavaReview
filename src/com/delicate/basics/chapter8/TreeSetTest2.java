package com.delicate.basics.chapter8;

class Z implements Comparable<Object> {
    int age;

    public Z(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}

public class TreeSetTest2 {
}
