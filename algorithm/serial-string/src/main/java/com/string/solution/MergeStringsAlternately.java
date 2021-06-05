package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/5 18:31
 */
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = word1.length() < word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length() >= word2.length()) {
            sb.append(word1.substring(len));
        } else {
            sb.append(word2.substring(len));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}
