package com.delicate.basics.chapter6;

import java.lang.ref.WeakReference;

public class ReferenceTest {
    public static void main(String[] args) {
        String str = new String("Java Notebook");
        WeakReference<String> wr = new WeakReference<>(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.runFinalization();
        System.out.println(wr.get());
    }
}
