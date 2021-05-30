package com.offer.solution;

/**
 * @Author pengweiwei
 * @Date 2021/4/8 23:10
 */
public class Solution10_1 {
    /**
     * 方法一：递归
     * 存在大量重复计算
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }
}
