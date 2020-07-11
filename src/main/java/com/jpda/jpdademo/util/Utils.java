package com.jpda.jpdademo.util;

public class Utils {

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static <T> boolean isNullOrEmptyArray(Object[] arr) {
        return arr == null || arr.length == 0;
    }


    public static int safeParseInt(String origin, int defaultVal) {
        return (int) safeParseLong(origin, defaultVal);
    }


    public static long safeParseLong(String origin, int defaultVal) {
        try {
            return Long.parseLong(origin);
        } catch (Exception e) {
            return defaultVal;
        }
    }

    static double safeParseDouble(String origin) {
        try {
            return Double.parseDouble(origin);
        } catch (Exception e) {
            return 0d;
        }
    }
}
