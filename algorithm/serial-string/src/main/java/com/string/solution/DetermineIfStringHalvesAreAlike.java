package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/3 22:36
 */
public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        String pre = s.substring(0, s.length() / 2);
        String last = s.substring(s.length() / 2);
        String tmp = "aeiouAEIOU";
        int num1 = 0, num2 = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (tmp.contains(String.valueOf(pre.charAt(i)))) {
                num1++;
            }
            if (tmp.contains(String.valueOf(last.charAt(i)))) {
                num2++;
            }
        }
        return num1 == num2;
    }

    public static void main(String[] args) {
        String s1 = "book";
        String s2 = "textbook";
        String s3 = "MerryChristmas";
        String s4 = "AbCdEfGh";
        System.out.println(halvesAreAlike(s1));
        System.out.println(halvesAreAlike(s2));
        System.out.println(halvesAreAlike(s3));
        System.out.println(halvesAreAlike(s4));
    }
}
