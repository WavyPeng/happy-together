package com.ctci.solution.p01;

/**
 * @author pengweiwei
 * @date 2021/4/20 3:17 PM
 */
public class Solution03 {
    /**
     * 思路一：replaceAll
     *
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces(String S, int length) {
        return S.substring(0, length).replaceAll(" ", "%20");
    }

    /**
     * 思路二：遍历替换
     *
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces1(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (' ' == c) {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        int length = 13;
        System.out.println(replaceSpaces(s, length));
        System.out.println(replaceSpaces1(s, length));
    }
}
