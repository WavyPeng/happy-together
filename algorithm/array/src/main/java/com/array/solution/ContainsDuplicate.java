package com.array.solution;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author pengweiwei
 * @Date 2021/7/29 21:52
 */
public class ContainsDuplicate {
    /**
     * 思路一：哈希表
     * 时间复杂度：O(N)
     * 空间复杂度：O(N)
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 思路二：排序+比较
     * 时间复杂度：O(NlogN)
     * 空间复杂度：O(logN)
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 思路三：Java8 Stream
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate2(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate1(nums));
        System.out.println(containsDuplicate2(nums));
    }
}
