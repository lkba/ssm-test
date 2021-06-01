package com.lkb.algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {33, 22, 1, 4, 25, 88, 71, 4};
        insertionSort(array);
    }

    /**
     * 插入排序
     */
    private static void insertionSort(int[] array) {
        print(array);
        for (int i = 1; i <array.length; i++) {
            int j = i - 1;
            int value = array[i];
            for (;j>=0;j--){
                if (array[j]>value){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=value;
            print(array);
        }
    }
    /**
     * 打印数组
     * @param array a
     */
    private static void print(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
