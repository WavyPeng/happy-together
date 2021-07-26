package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/26 23:49
 */
public class TwoSumInputArrayIsSortedII {
    /**
     * 思路一：暴力求解
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }

    /**
     * 思路二：二分
     * 由于是有序数组，因此可以定义双指针，分别指向数组首尾，寻找和为target的目标值
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{};
    }
}
