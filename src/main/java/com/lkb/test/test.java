package com.lkb.test;


import java.util.*;
import java.util.regex.Pattern;

public  class test {

    static List<String> list = new ArrayList<String>();
    static List<String> list2 = new LinkedList<>();
    static Set<String> set = new HashSet<String>();
    static Set<String> set2= new TreeSet<>();
    static Map<String,String> set22;

    static Map<String, String> map = new HashMap<String, String>();
    static {
        set22.put("s","s");
        set22.values();
        list.add("1");
        list.add("2");
        list.add("3");
set2.add("a");
        set.add("1");
        set.add("7");
        set.add("3");

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
    }
    public static String replaceAll(String s,String regex, String replacement) {
        return Pattern.compile(regex).matcher(s).replaceAll(replacement);
    }

    public static void main(String[] args) {
//        String s="aaaa111sd";
//        System.out.println(replaceAll(s,"[a-z]","CX"));
        list = Collections.unmodifiableList(list);
        set = Collections.unmodifiableSet(set);
        map = Collections.unmodifiableMap(map);

        Integer s1= 211;
        Integer s3= 2111;
        System.out.println(s1==s3);
//        String[] strings=new String[]{"aaa","nbbb","vvv"};
//        List<String> list=Arrays.asList(strings);
//        for (String sa:list){
//            System.out.println(sa);
//        }
//
//        List<String> list1=Arrays.asList("aaa","nbbb","vvv");
//        String[] array=list.toArray(new String[list1.size()]);
//        for (String sa:array){
//            System.out.println(sa);
//        }

//        short s1=1;s1= (short) (s1+1);
//        A:for (int i=0;i<10;i++){
//            for (int j=0;j<10;j++){
//                System.out.println(j);
//                if (j==5){
////                    break ;
//                    break A;
//                }
//            }
//        }
//        new B().print();
//        int[] b=new int[2];
//        b[1]=1;
//        System.out.println(b[1]);
//        int[] a = {0, 1, 2, 4, 5};
//        rec(a);
//        int bs = a.length / 2 + 1;
//        System.out.println( binSearch_2(1,a,0,a.length-1));
//        int i=5;
//        switch (i){
//            default:
//                System.out.println("Def");
//            case 0:
//                System.out.println(0);
//
//            case 1:
//                System.out.println(1);
//                break;
//        }
    }

    private static class A {
        static {
            System.out.println("A static");
        }

        public A() {
            System.out.println("A constructor");
        }

        public void print() {
            System.out.println("A print");
        }
    }

    public static void rec(int[] arr) {


        //第一个for循环是程序需要执行要走多少趟

        for(int i=0;i<arr.length-1;i++){
            //第二个for循环是每趟需要比较多少次
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    //定义一个临时变量temp
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    public static int binSearch_2(int key,int[] array,int low,int high) {
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        int middle = (low+high)/2;
        if (array[middle]>key){
            //大于关键字
            return  binSearch_2(key,array,low,middle-1);
        }else if (array[middle]<key){
            return binSearch_2(key,array,middle+1,high);
        }else {
            return array[middle];
        }
    }

    private static class B extends A {
        static {
            System.out.println("B static");
        }

        public B() {
            System.out.println("B constructor");
        }

        public void print() {
            System.out.println("B print");
        }
    }


}
