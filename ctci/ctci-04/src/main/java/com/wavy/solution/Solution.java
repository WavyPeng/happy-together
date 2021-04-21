package com.wavy.solution;


import java.util.HashSet;
import java.util.Set;

/**
 * @author pengweiwei
 * @date 2021/4/21 10:59 AM
 */
public class Solution {
    /**
     * 思路一：使用set去重
     * 回文字符串存在两种情况，偶数长度（如：abba）、奇数长度（如：abcba）
     * 如果是偶数长度，则字符串中字符个数均为偶数
     * 如果是奇数长度，则字符串中只有一个字符个数为奇数
     *
     * @param s
     * @return
     */
    public static boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() <= 1;
    }

    public static void main(String[] args) {
        String s = "abbacd";
        System.out.println(canPermutePalindrome(s));
    }
}
