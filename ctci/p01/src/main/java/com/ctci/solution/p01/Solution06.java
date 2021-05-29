package com.ctci.solution.p01;


/**
 * @author pengweiwei
 * @date 2021/4/22 2:16 PM
 */
public class Solution06 {
    /**
     * @param S
     * @return
     */
    public static String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                count++;
            } else {
                sb.append(S.charAt(i));
                sb.append(count);
                count = 1;
            }
            if (i == S.length() - 2) {
                sb.append(S.charAt(i + 1));
                sb.append(count);
            }
        }
        String compressStr = sb.toString();
        return compressStr.length() >= S.length() || S.length() == 1 ? S : compressStr;
    }

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        String s1 = "abbccd";
        String s2 = "a";
        String s3 = "aa";
        String s4 = "ab";
        String s5 = "";
        System.out.println(compressString(s));
        System.out.println(compressString(s1));
        System.out.println(compressString(s2));
        System.out.println(compressString(s3));
        System.out.println(compressString(s4));
        System.out.println(compressString(s5));
    }
}
