package com.array.solution;

import java.util.Arrays;

/**
 * @Author pengweiwei
 * @Date 2021/7/15 23:36
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // 不是9，加1不进位
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            // 为9，加1进位
            digits[i] = 0;
        }
        // 原数组全部为9，加1进位，超出原数组长度
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(digits1)));
    }
}
