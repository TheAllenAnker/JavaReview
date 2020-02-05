package com.delicate.basics.chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        c.add("孙悟空");
        c.add(6);
        System.out.println("Collection c's size: " + c.size());
        c.remove(6);
        System.out.println("Collection c's size: " + c.size());
        System.out.println(c.contains("孙悟空"));
        c.add("Java Review");
        System.out.println(c);
        Collection<String> books = new HashSet<>();
        books.add("Thinking in Java");
        books.add("Algorithms");
        books.add("Java Review");
        System.out.println(c.containsAll(books));
        c.removeAll(books);
        System.out.println(c);
        c.clear();
        System.out.println(c);
        books.retainAll(c);
        System.out.println(books);
    }
}
