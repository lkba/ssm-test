package com.lkb.algorithm;

import java.util.ArrayDeque;

import java.util.Deque;

public class WaterVolume {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
        int[] height2 = {2,0,2};
        System.out.println(trap(height2));
    }

    public static int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int capacity = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                stack.pop();
                if (stack.isEmpty()) {
                    continue;
                }
                int h = Math.min(height[stack.peek()], height[i]);
                int w = i - stack.peek() - 1;
                int cap = w * h;
                for (int j = stack.peek() + 1; j < i; j++) {
                    cap -= height[j];   // 减去格子本身
                    height[j] = h;      // 填海
                }
                capacity += cap;
            }
            stack.push(i);  // 别忘了入栈啊 >_<
        }
        return capacity;
    }
    //通过一个严格递减的单调栈，找到某根柱子右侧第一个大于等于它的柱子，组成一个盛水的容器。


}
/*
思路：
1.取最高的柱，标记下最高的
2.找左边最高的，计算面积，然后减去中间的方块，不断循环，直到0
3.找右边的，计算面积，然后减去中间的方块，不断循环，直到max

给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。



上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的直方图，在这种情况下，可以接 6 个单位的水（蓝色部分表示水）。 感谢 Marcos 贡献此图。

示例:

输入: [0,1,0,2,1,0,1,3,2,1,2,1]
输出: 6

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/volume-of-histogram-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */