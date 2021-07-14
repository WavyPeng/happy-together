package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/14 23:19
 */
public class RemoveElement {
    /**
     * 思路：双指针
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
