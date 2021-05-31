package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/5/31 23:46
 */
public class IncreasingDecreasingString {
    /**
     * 思路：桶计数
     * <p>
     * 对于新生成的字符串，仅考虑字符本身，而无需关心字符在原字符串中的位置。
     * 因此，可以创建一个大小为26的桶，记录字符串中的字符出现的次数
     * 每次提取最长的上升或下降字符串时，我们直接顺序或逆序遍历这个桶，每次遍历后，当前桶的字符个数减1，直到新字符串和原字符串长度相等。
     *
     * @param s
     * @return
     */
    public static String sortString(String s) {
        int[] tmp = new int[26];
        for (char c : s.toCharArray()) {
            tmp[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] > 0) {
                    sb.append((char) (i + 'a'));
                    tmp[i]--;
                }
            }
            for (int i = tmp.length - 1; i >= 0; i--) {
                if (tmp[i] > 0) {
                    sb.append((char) (i + 'a'));
                    tmp[i]--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "aaaabbbbcccc";
        String s2 = "rat";
        String s3 = "leetcode";
        String s4 = "ggggggg";
        String s5 = "spo";
        System.out.println(sortString(s1));
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
        System.out.println(sortString(s4));
        System.out.println(sortString(s5));
    }
}
