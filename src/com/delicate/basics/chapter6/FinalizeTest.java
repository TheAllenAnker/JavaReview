package com.delicate.basics.chapter6;

public class FinalizeTest {
    private static FinalizeTest ft = null;

    public void info() {
        System.out.println("Testing method finalize()");
    }

    public static void main(String[] args) throws InterruptedException {
        new FinalizeTest();
        System.gc();
        Thread.sleep(2000);
        ft.info();
    }

    @Override
    protected void finalize() throws Throwable {
        ft = this;
    }
}
