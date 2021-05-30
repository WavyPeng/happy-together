package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/5/30 21:53
 */
public class ReplaceAllDigitsWithCharacters {
    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (i % 2 != 0) {
                char c = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
                sb.append(c);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "a1c1e1";
        String s2 = "a1b2c3d4e";
        System.out.println(replaceDigits(s1));
        System.out.println(replaceDigits(s2));
    }
}
