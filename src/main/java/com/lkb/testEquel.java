package com.lkb;

import org.springframework.web.servlet.support.JstlUtils;

import java.util.Random;

public class testEquel   {
    public static void main(String[] args) {

        System.out.println("Math.round(1.4)=" + Math.ceil(2));
        String s = "ABCDE";
       String b="abcde";
        System.out.println("16 <<1 : " + (16 <<1));
        System.out.println("16 <<1 : " + (16 <<2));
        System.out.println("16 >> 3 : " + (16 >> 5));
        System.out.println("16 >> 10 : " + (16 >> 10));
        System.out.println("1 >> 1 : " + (1 >> 1));
        System.out.println("16 >>> 2 : " + (16 >>> 2));
        System.out.println("-16 >> 2 : " + (-16 >> 2));
        System.out.println("-16 <<2 : " + (-16 <<2));
        System.out.println("-16 >>> 2 : " + (-16 >>> 2));

    }

    public static String reverseString(String str) {
        if (str != null && str.length() > 0) {
            int len = str.length();
            char[] chars = new char[len];
            for (int i = len - 1; i >= 0; i--) {
                chars[len - 1 - i] = str.charAt(i);
            }
            return new String(chars);
        }
        return str;
    }

    public static String reverseStringByRecursion(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringByRecursion(str.substring(1)) + str.charAt(0);
    }

    public static String getString() {
        String str = "A";
        try {
            str = "B";
            return str;
        } finally {
            System.out.println("finally");
            str = "C";
            return str;
        }
    }
}

class StaticFinal {
    final int fValue = new Random().nextInt();
    static int sValue = new Random().nextInt();
}

