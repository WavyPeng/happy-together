package com.wavy.solution;

/**
 * @Author pengweiwei
 * @Date 2021/3/28 23:52
 */
public class Solution {
    /**
     * 思路：
     * 从右上角开始，将当前元素和目标数值进行比对：
     * 1. matrix[row][col]>target, col--
     * 2. matrix[row][col]<target, row++
     * 3. matrix[row][col]=target, return true
     * 时间复杂度：O(m+n)
     *
     * @param matrix
     * @param target
     * @return
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (null == matrix || matrix.length == 0) {
            return false;
        }
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        System.out.println(findNumberIn2DArray(matrix, target));
    }
}
