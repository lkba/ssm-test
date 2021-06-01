package com.lkb.algorithm;
/**
 * 选择排序
 * @author ConstXiong
 * @date  2020-04-09 12:25:12
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {33, 22, 1, 4, 25, 88, 71, 4};
        selectionSort(array);
    }

    /**
     * 选择排序
     * @param array a
     */
    public static void selectionSort(int[] array) {
        print(array);

        //进行 数组长度-1 轮比较
        int minIndex;
        for (int i = 0; i <array.length-1; i++) {
            minIndex = i;//取未排序区第一个数的下标

            for (int j = i+1; j <array.length; j++) {
                if (array[j] <array[minIndex]) {
                    //找到未排序区域最小值的下标
                    minIndex = j;
                }
            }
            //找到的最小值是否需要挪动
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
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
