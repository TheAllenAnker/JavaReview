package com.delicate.basics.chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyy 年中第 D 天");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        String str = "07###三月##21";
        sdf = new SimpleDateFormat("y###M##d");
        System.out.println(sdf.parse(str));
    }
}
