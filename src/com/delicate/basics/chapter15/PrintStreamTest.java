package com.delicate.basics.chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("test.txt"))
        ) {
            ps.println("Normal String");
            ps.println(new PrintStreamTest());
        }
    }
}
