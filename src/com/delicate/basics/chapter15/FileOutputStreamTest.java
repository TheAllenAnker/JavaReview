package com.delicate.basics.chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
                FileOutputStream fos = new FileOutputStream("newFile.txt")
        ) {
            byte[] buf = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(buf)) > 0) {
                fos.write(buf, 0, hasRead);
            }
        }
    }
}
