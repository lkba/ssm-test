package com.lkb.algorithm;
/**
 *  希尔排序
 * @author ConstXiong
 * @date 2020-04-11 11:58:58
 */
public class ShellSort {
    public static void main(String[] args) {
        int [] array = {33, 22, 1, 4, 25, 88, 71, 4};
        shellSort(array);
    }

    /**
     * 希尔排序
     * @param array
     */
    private static void shellSort(int[] array) {
        print(array);
        int length = array.length;
        int step = length / 2; //步长，默认取数组长度一半
        int temp;
        while (step > 0) {
            for (int i = step; i <length; i++) { //从步长值为下标，开始遍历
                temp = array[i]; //当前值
                int preIndex = i - step; //步长间隔上一个值的下标
                //在步长间隔的的数组中，找到需要插入的位置，挪动右边的数
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + step] = array[preIndex];
                    preIndex -= step;
                }
                //把当前值插入到在步长间隔的的数组中找到的位置
                array[preIndex + step] = temp;
            }
            step /= 2;
            print(array);
        }
    }

    /**
     * 打印数组
     * @param array
     */
    private static void print(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
