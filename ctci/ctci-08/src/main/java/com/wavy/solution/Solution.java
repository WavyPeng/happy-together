package com.wavy.solution;

/**
 * @author pengweiwei
 * @date 2021/4/22 5:18 PM
 */
public class Solution {
    /**
     * 思路一：
     *
     * @param matrix
     */
    public static int[][] setZeroes(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] tempMatrix = new int[M][N];
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                if (matrix[row][col] != 0) {
                    tempMatrix[row][col] = matrix[row][col];
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
