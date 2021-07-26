package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/26 23:27
 */
public class SingleNumber {
    /**
     * 思路：位运算
     * 因为只有一个元素是不同地，因此可以对数组中的元素进行异或操作
     * i^0=i
     * i^i=0
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
