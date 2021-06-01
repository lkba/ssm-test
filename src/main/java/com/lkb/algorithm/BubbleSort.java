package com.lkb.algorithm;

/**
 * 冒泡算法
 */
public class BubbleSort {
    public static void main(String[] args){
        int [] array = {33, 22, 1, 4, 25, 88, 71, 4};
        bubbleSort(array);
    }

    /**
     * 冒泡排序
     * @param array 数组
     */
    private static void bubbleSort(int[] array){
        print(array);
        for (int i=0;i<array.length;i++){
            //提前退出冒泡循环的标志
            boolean hasSwitch = false;
            //因为使用 j 和 j+1 的下标进行比较，所以 j 的最大值为数组长度 - 2
            for (int j=0;j<array.length-(i+1);j++){
                if (array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    hasSwitch=true;//有数据交换
                    print(array);
                }
            }
            //没有数据交换退出循环
            if (!hasSwitch) {
                break;
            }
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
