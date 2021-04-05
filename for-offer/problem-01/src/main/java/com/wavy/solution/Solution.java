package com.wavy.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author pengweiwei
 * @Date 2021/3/25 23:11
 */
public class Solution {
    /**
     * 方法一：使用HashSet过滤重复元素
     * 时间复杂度O(n)，空间复杂度O(n)
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}
