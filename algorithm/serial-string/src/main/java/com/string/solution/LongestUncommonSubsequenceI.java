package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/14 21:56
 */
public class LongestUncommonSubsequenceI {
    /**
     * 思路：
     * 注意特殊序列的定义：该序列为某字符串独有
     * 因此考虑以下几种情况：
     * (1) a.length=b.length，如果a=b，则不存在特殊序列，返回-1；
     * 如果a≠b，则a和b都是特殊序列，返回a.length或b.length；
     * (2) a.length≠b.length，则a、b中的长字符串一定是那个最长特殊序列，
     * 因此返回max(a.length,b.length)即可；
     *
     * @param a
     * @param b
     * @return
     */
    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        String a1 = "aba", b1 = "cdc";
        String a2 = "aaa", b2 = "bbb";
        String a3 = "aaa", b3 = "aaa";
        System.out.println(findLUSlength(a1, b1));
        System.out.println(findLUSlength(a2, b2));
        System.out.println(findLUSlength(a3, b3));
    }
}
