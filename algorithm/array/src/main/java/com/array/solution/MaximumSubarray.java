package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/14 23:34
 */
public class MaximumSubarray {
    /**
     * 思路一：暴力求解
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }

    /**
     * 思路二：动态规划
     * 状态转移方程：f(i)=max{f(i-1)+nums[i],nums[i]}
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public static int maxSubArray1(int[] nums) {
        int pre = 0, max = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            max = Math.max(max, pre);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray1(nums));

        int[] nums1 = new int[]{1};
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray1(nums1));

        int[] nums2 = new int[]{0};
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray1(nums2));

        int[] nums3 = new int[]{-100000};
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray1(nums3));

        int[] nums4 = new int[]{-1};
        System.out.println(maxSubArray(nums4));
        System.out.println(maxSubArray1(nums4));
    }
}
