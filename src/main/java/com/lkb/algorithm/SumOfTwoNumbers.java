package com.lkb.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//两数之和
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                res[0] = i;
                    res[1] = map.get(nums[i]);
                    return res;
            }
            map.put(target-nums[i],i);
        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int t = i + 1; t < nums.length; t++) {
//                if (target == nums[i] + nums[t]) {
//                    res[0] = i;
//                    res[1] = t;
//                    return res;
//                }
//            }
//        }
        return res;
    }
}

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

 

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]
 

提示：

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
只会存在一个有效答案
 */
