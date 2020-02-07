package com.delicate.basics.chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/delicate/basics/chapter15/FileInputStreamTest.java");
        byte[] buffer = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fis.read(buffer)) > 0) {
            System.out.print(new String(buffer, 0, hasRead));
        }
        fis.close();
    }
}
