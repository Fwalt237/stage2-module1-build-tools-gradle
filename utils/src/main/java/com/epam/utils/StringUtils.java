package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         return isNumeric(str) && Integer.parseInt(str) > 0;//here magic will happen
    }
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
