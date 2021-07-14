package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/14 23:07
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (target <= nums[i]) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target1 = 5;
        System.out.println(searchInsert(nums, target1));

        int target2 = 2;
        System.out.println(searchInsert(nums, target2));

        int target3 = 7;
        System.out.println(searchInsert(nums, target3));

        int target4 = 0;
        System.out.println(searchInsert(nums, target4));
    }
}
