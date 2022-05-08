package com.lkb.algorithm;


/**
 * 递归算法
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursionN(3));
        System.out.println(recursionString("asdf"));
    }
    /**
     * 递归计算n的阶乘
     * @param n s
     * @return int
     */
    private static int  recursionN(int n){
        if (n<1){
            throw new IllegalArgumentException("参数必须大于0");
        }else if(n==1){
           return 1;
        }else {
            return n*recursionN(n-1);
        }
    }
    /**
     * 字符串反转
     */
    public static String recursionString(String str){
        if (str.length()<=1||str==null){
            return str;
        }else {
           return recursionString(str.substring(1))+str.charAt(0);
        }
    }
}
