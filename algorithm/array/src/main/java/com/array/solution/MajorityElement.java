package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/27 0:05
 */
public class MajorityElement {
    /**
     * 思路：对拼消耗
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int count = 1;
        int major = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                count++;
            } else {
                count--;
                if (count == 0 && i + 1 < nums.length) {
                    major = nums[i + 1];
                }
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
