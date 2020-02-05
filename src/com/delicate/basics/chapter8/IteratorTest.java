package com.delicate.basics.chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("Thinking in Java");
        books.add("Thinking in Go");
        books.add("Thinking in Python");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            String book = it.next();
            System.out.println(book);
            if (book.equals("Thinking in Java")) {
                it.remove();
            }
            book = "Test String";
        }
        System.out.println(books);
    }
}
