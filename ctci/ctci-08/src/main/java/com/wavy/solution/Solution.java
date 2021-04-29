package com.wavy.solution;

/**
 * @author pengweiwei
 * @date 2021/4/22 5:18 PM
 */
public class Solution {
    /**
     * 思路一：
     * 利用数组去标记出现0的行和列，然后根据标记数组遍历将所有出现0的行和列元素置0
     * 时间复杂度：O(mn)
     * 空间复杂度：O(m+n)
     *
     * @param matrix
     */
    public static int[][] setZeroes(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        boolean[] row = new boolean[M];
        boolean[] col = new boolean[N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        matrix = setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
                if (j == matrix.length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
}
