package com.ctci.solution.p01;

/**
 * @author pengweiwei
 * @date 2021/4/21 2:24 PM
 */
public class Solution05 {
    /**
     * 思路一：
     * 1.如果两个字符串长度差大于1，则一次修改无法满足
     * 2.遍历两个字符串
     * 2.1 如果字符相等，则向后继续遍历比较
     * 2.2 如果不相等，则需要修改次数加1，如果该次数超过1，则无法满足；
     * 2.3 如果修改次数未超过1，则短字符回归上次比较的字符，长字符串后移一个字符，重复上述比较过程
     *
     * @param first
     * @param second
     * @return
     */
    public static boolean oneEditAway(String first, String second) {
        int firstLen = first.length();
        int secondLen = second.length();
        if (Math.abs(firstLen - secondLen) > 1) {
            return false;
        }
        int count = 0;
        int i = 0, j = 0;
        while (i < firstLen && j < secondLen) {
            if (first.charAt(i++) == second.charAt(j++)) {
                continue;
            }
            count++;
            if (count > 1) {
                return false;
            }
            if (firstLen != secondLen) {
                if (firstLen > secondLen) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "teacher";
        String second = "beacher";
        System.out.println(oneEditAway(first, second));
    }
}
