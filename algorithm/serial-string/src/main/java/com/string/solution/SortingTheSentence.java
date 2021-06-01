package com.string.solution;

import java.util.Arrays;

/**
 * @Author pengweiwei
 * @Date 2021/6/1 23:56
 */
public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs, (s1, s2) -> {
            int idx1 = s1.charAt(s1.length() - 1);
            int idx2 = s2.charAt(s2.length() - 1);
            return Integer.compare(idx1, idx2);
        });
        for (String str : strs) {
            sb.append(str.substring(0, str.length() - 1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s1));
        System.out.println(sortSentence(s2));
    }
}
