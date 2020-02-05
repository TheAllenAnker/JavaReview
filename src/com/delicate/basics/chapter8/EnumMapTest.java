package com.delicate.basics.chapter8;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap<Season, String> enumMap = new EnumMap<>(Season.class);
        enumMap.put(Season.SUMMER, "Summer Vibe");
        enumMap.put(Season.SPRING, "Spring Bloom");
        System.out.println(enumMap);
    }
}

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

