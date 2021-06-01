package com.lkb.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
子集
 */
public class Subset {
    public static void main(String[] args) {
        int[] ums = {1,2,2};
        System.out.println(subsetsWithDup(ums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> retList = new ArrayList<>();
        retList.add(new ArrayList<>());
        if(nums == null || nums.length == 0) return retList;
        Arrays.sort(nums);


        List<Integer> tmp = new ArrayList<>();
        tmp.add(nums[0]);
        retList.add(tmp);
        if(nums.length == 1) return retList;

        int lastLen = 1;

        for(int i = 1; i < nums.length; i++){
            int size = retList.size();
            if(nums[i] != nums[i-1]){
                lastLen = size;
            }

            for(int j = size - lastLen; j < size; j++){
                List<Integer> inner = new ArrayList(retList.get(j));
                inner.add(nums[i]);
                retList.add(inner);
            }
        }
        return retList;
    }

    /*
    给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。

示例 1：

输入：nums = [1,2,2]
输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
示例 2：

输入：nums = [0]
输出：[[],[0]]
 

提示：

1 <= nums.length <= 10
-10 <= nums[i] <= 10
     */
}
