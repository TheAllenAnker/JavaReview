package com.delicate.basics.chapter7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        double db = 12340000.567;
        Locale[] locales = {Locale.CHINA, Locale.US, Locale.UK, Locale.CANADA, Locale.GERMANY, Locale.JAPAN};
        NumberFormat[] nf = new NumberFormat[18];
        for (int i = 0; i < locales.length; i++) {
            nf[i * 3] = NumberFormat.getNumberInstance(locales[i]);
            nf[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
            nf[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
        }
        for (int i = 0; i < locales.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("----------- China's Format -----------");
                    break;
                case 1:
                    System.out.println("----------- US Format -----------");
                    break;
                case 2:
                    System.out.println("----------- UK Format -----------");
                    break;
                case 3:
                    System.out.println("----------- Canada's Format -----------");
                    break;
                case 4:
                    System.out.println("----------- Germany's Format -----------");
                    break;
                case 5:
                    System.out.println("----------- Japan's Format -----------");
                    break;
            }
            System.out.println("Number's Format: " + nf[i * 3].format(db));
            System.out.println("Percentage's Format: " + nf[i * 3 + 1].format(db));
            System.out.println("Currency's Format: " + nf[i * 3 + 2].format(db));
        }
    }
}
