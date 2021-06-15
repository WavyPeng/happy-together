package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/15 22:12
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {
    /**
     * 思路：
     * 1.s1.length≠s2.length，返回false
     * 2.s1.length=s2.length，定义两个临时字符串tmp1，tmp2，分别对应s1，s2，
     * 遍历s1，s2，对于s1与s2不同的字符，分别加到s1对应字符串变量的后面，s2对应字符串变量的前面，
     * 最终比较tmp1，tmp2的长度是否为2，且是否相等
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String tmp1 = "", tmp2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (tmp1.length() > 2) {
                return false;
            }
            if (s1.charAt(i) != s2.charAt(i)) {
                tmp1 += s1.charAt(i);
                tmp2 = s2.charAt(i) + tmp2;
            }
        }
        return tmp1.equals(tmp2);
    }

    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        String s3 = "attack", s4 = "defend";
        String s5 = "kelb", s6 = "kelb";
        String s7 = "abcd", s8 = "dcba";
        System.out.println(areAlmostEqual(s1, s2));
        System.out.println(areAlmostEqual(s3, s4));
        System.out.println(areAlmostEqual(s5, s6));
        System.out.println(areAlmostEqual(s7, s8));
    }
}
