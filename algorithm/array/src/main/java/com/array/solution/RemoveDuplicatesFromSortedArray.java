package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/12 23:06
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * 思路：双指针
     * 定义快慢指针，每次比较fast和fast-1的值是否相等，
     * 1.如果不相等，说明不是重复的值，则让slow指向的值等于fast指向的值，slow、fast向后移
     * 2.如果相等，则继续后移，直到遇到不重复的值，或结束遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int slow = 1, fast = 1;
        while (fast < len) {
            if (nums[fast - 1] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
