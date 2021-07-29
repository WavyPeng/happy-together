package com.array.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pengweiwei
 * @Date 2021/7/29 22:08
 */
public class ContainsDuplicateII {
    /**
     * 思路一：暴力求解
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int len = (i + k >= nums.length) ? nums.length - 1 : i + k;
            for (int j = i + 1; j <= len; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 思路二：哈希映射（类似TwoSum）
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {99, 99};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearbyDuplicate1(nums, k));
    }
}
