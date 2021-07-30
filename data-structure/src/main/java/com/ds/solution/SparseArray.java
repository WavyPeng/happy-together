package com.ds.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/31 0:22
 */
public class SparseArray {
    /**
     * 二维数组->稀疏数组
     *
     * @param array
     * @return
     */
    public static int[][] toSparseArray(int[][] array) {
        int itemSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != 0) {
                    itemSum++;
                }
            }
        }
        int[][] sparseArray = new int[itemSum + 1][3];
        int index = 0;
        sparseArray[index][0] = array.length;
        sparseArray[index][1] = array[0].length;
        sparseArray[index][2] = itemSum;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != 0) {
                    index++;
                    sparseArray[index][0] = i;
                    sparseArray[index][1] = j;
                    sparseArray[index][2] = array[i][j];
                }
            }
        }
        return sparseArray;
    }

    /**
     * 稀疏数组->二维数组
     *
     * @param sparseArray
     * @return
     */
    public static int[][] fromSparseArray(int[][] sparseArray) {
        int[][] array = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            array[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        return array;
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] srcArray = {
                {0, 0, 0, 22, 0, 0, 15},
                {0, 11, 0, 0, 0, 17, 0},
                {0, 0, 0, -6, 0, 0, 0},
                {0, 0, 0, 0, 0, 39, 0},
                {91, 0, 0, 0, 0, 0, 0},
                {0, 0, 28, 0, 0, 0, 0}
        };

        int[][] sparseArray = toSparseArray(srcArray);
        printArray(sparseArray);

        int[][] array = fromSparseArray(sparseArray);
        printArray(array);
    }
}
