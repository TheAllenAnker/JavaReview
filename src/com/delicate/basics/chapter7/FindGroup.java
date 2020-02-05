package com.delicate.basics.chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Java is not very easy.");
        while (m.find()) {
            System.out.println(m.group());
        }
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + "\t");
            i++;
        }
    }
}
