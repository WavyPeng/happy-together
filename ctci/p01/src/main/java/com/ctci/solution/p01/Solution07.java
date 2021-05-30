package com.ctci.solution.p01;

/**
 * @author pengweiwei
 * @date 2021/4/22 3:32 PM
 */
public class Solution07 {
    /**
     * 思路一：使用辅助数组
     * 创建一个临时矩阵，用于存储旋转后的元素，源矩阵和目标矩阵中各元素的位置对应关系：matrix[row][col]=matrix[col][n-row-1]
     * 之后再将临时矩阵中的数据替换回原矩阵
     * <p>
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n2)
     *
     * @param matrix
     */
    public static int[][] rotate(int[][] matrix) {
        int N = matrix.length;
        int[][] tempMatrix = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                tempMatrix[col][N - row - 1] = matrix[row][col];
            }
        }
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                matrix[row][col] = tempMatrix[row][col];
            }
        }
        return matrix;
    }

    /**
     * 思路二：先对折，再对角线交换
     * 1 2 3  对折   7 8 9  对角线  7 4 1
     * 4 5 6 -----> 4 5 6 -------> 8 5 2
     * 7 8 9        1 2 3   交换   9 6 3
     * <p>
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param matrix
     */
    public static int[][] rotate2(int[][] matrix) {
        int N = matrix.length;
        // 对折
        for (int row = 0; row < N / 2; row++) {
            for (int col = 0; col < N; col++) {
                int temp = matrix[N - row - 1][col];
                matrix[N - row - 1][col] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }
        // 对角线交换
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix = rotate2(matrix);
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
