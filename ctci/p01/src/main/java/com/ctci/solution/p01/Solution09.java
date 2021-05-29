package com.ctci.solution.p01;

/**
 * @Author pengweiwei
 * @Date 2021/4/26 23:30
 */
public class Solution09 {
    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2) ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isFlipedString(s1, s2));
    }
}
