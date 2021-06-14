package com.string.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author pengweiwei
 * @Date 2021/6/9 23:10
 */
public class GroupsOfSpecialEquivalentStrings {

    /**
     * 思路：
     * 定义一个长度为52的数组，0-25统计字符串偶数下表的字符出现的个数，
     * 26-51统计奇数下表字符出现的个数；奇偶下标字符个数相同的字符串可以通过交换具有相同的排列；
     *
     * @param words
     * @return
     */
    public static int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            int[] count = new int[52];
            for (int j = 0; j < words[i].length(); j++) {
                count[words[i].charAt(j) - 'a' + (j % 2) * 26]++;
            }
            set.add(Arrays.toString(count));
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        String[] words2 = {"abc", "acb", "bac", "bca", "cab", "cba"};
        System.out.println(numSpecialEquivGroups(words1));
        System.out.println(numSpecialEquivGroups(words2));
    }
}
