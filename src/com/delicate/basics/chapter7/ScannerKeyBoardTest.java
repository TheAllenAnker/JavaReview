package com.delicate.basics.chapter7;

import java.util.Scanner;

public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            System.out.println("Content Entered: " + sc.next());
        }
    }
}
