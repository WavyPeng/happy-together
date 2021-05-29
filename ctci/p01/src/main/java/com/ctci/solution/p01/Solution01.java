package com.ctci.solution.p01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pengweiwei
 * @date 2021/4/20 11:38 AM
 */
public class Solution01 {
    public static boolean isUnique(String astr) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            s.add(astr.charAt(i));
        }
        return s.size() == astr.length();
    }

    public static void main(String[] args) {
        String astr = "leetcode";
        System.out.println(isUnique(astr));
    }
}
