package com.lkb.test.za7za8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class msoutput {
    public static void main(String[] args) {

        byte a = 127;
        byte b = 127;
        System.out.println(a);
        a = (byte) (a + b); // 报编译错误:cannot convert from int to byte
        System.out.println(a);
         b += a;
        System.out.println(b);

        short s1= 1; s1 = (short) (s1 + 1);
    }

}
