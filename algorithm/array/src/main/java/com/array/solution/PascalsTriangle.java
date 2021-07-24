package com.array.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pengweiwei
 * @Date 2021/7/24 14:34
 */
public class PascalsTriangle {
    /**
     * 杨辉三角
     * 1
     * 11
     * 121
     * 1331
     * 14641
     * .....
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rectangle = new ArrayList<>();
        int[][] tmp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> array = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tmp[i][j] = 1;
                } else {
                    tmp[i][j] = tmp[i - 1][j - 1] + tmp[i - 1][j];
                }
                array.add(tmp[i][j]);
            }
            rectangle.add(array);
        }
        return rectangle;
    }

    public static void main(String[] args) {
        int numRows = 4;
        List<List<Integer>> rectangle = generate(numRows);
        for (int i = 0; i < rectangle.size(); i++) {
            for (int j = 0; j < rectangle.get(i).size(); j++) {
                System.out.print(rectangle.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
