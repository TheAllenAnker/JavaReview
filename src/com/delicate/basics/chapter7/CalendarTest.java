package com.delicate.basics.chapter7;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        c.set(1999, 12, 16, 21, 34, 06);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());
        c.roll(Calendar.MONTH, -8);
        System.out.println(c.getTime());
        System.out.println(TimeZone.getDefault().getID());
    }
}
