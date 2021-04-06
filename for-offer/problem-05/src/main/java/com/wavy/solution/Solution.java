package com.wavy.solution;

/**
 * @Author pengweiwei
 * @Date 2021/4/6 23:03
 */
public class Solution {
    /**
     * 思路一：遍历迭代
     * 由于数组是升序排列的旋转，因此可以遍历数组中的元素，直到num[i]>num[i+1]
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param numbers
     * @return
     */
    public static int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                min = numbers[i];
                break;
            }
        }
        return min;
    }

    /**
     * 思路二：二分查找
     * 平均时间复杂度：O(logn)，特殊情况数组元素完全相同O(n)
     * 空间复杂度：O(1)
     *
     * @param numbers
     * @return
     */
    public static int minArray1(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else {
                high--;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers));
        System.out.println(minArray1(numbers));
    }
}
