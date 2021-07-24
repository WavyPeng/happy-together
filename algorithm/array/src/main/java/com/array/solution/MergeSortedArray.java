package com.array.solution;

import java.util.Arrays;

/**
 * @Author pengweiwei
 * @Date 2021/7/19 23:57
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        m--;
        n--;
        while (n >= 0) {
            if (m >= 0 && (nums1[m] > nums2[n])) {
                nums1[last--] = nums1[m--];
            } else {
                nums1[last--] = nums2[n--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
