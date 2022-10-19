package com.ucaldas.proyect_testing.utils;

public class StringUtils {
    public static String repeat(String str, int times) throws IllegalArgumentException {
        String result = "";

        if (times < 0 ) {
            throw new IllegalArgumentException("Negative times not allowed");
        }

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
