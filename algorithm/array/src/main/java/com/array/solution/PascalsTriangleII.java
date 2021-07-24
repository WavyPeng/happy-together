package com.array.solution;

import java.util.Arrays;
import java.util.List;

/**
 * @Author pengweiwei
 * @Date 2021/7/24 15:00
 */
public class PascalsTriangleII {
    /**
     * 思路：动态规划
     * 除去j=0和j=i的元素值为1，其余元素由其上一行对应j的元素加上j-1位置的元素相加获得
     * 即arr[j] = arr[j] + arr[j - 1]
     * 此处有一点需要注意的是需要倒序处理，防止前一个元素先处理造成后续元素处理错误
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 1);
        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> list = getRow(rowIndex);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
