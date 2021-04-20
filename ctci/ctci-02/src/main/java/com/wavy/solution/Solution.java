package com.wavy.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengweiwei
 * @date 2021/4/20 2:18 PM
 */
public class Solution {
    /**
     * 思路一：把两个字符串排序后进行比较
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean CheckPermutation1(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));
    }

    /**
     * 思路二：哈希计数
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean CheckPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(CheckPermutation2(s1, s2));
    }
}
