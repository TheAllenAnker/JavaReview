package com.delicate.basics.chapter6;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        String str = new String("Java Notebook");
        ReferenceQueue<String> rq = new ReferenceQueue<>();
        PhantomReference<String> pr = new PhantomReference<>(str, rq);
        str = null;
        System.out.println(pr.get());
        System.gc();
        System.runFinalization();
        System.out.println(rq.poll() == pr);
    }
}
