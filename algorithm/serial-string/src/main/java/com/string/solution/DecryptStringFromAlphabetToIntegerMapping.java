package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/5 19:58
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append((char) ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') - 1 + 'a'));
                i += 3;
            } else {
                sb.append((char) ((s.charAt(i) - '0') - 1 + 'a'));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "1326#";
        String s1 = "10#11#12";
        System.out.println(freqAlphabets(s));
        System.out.println(freqAlphabets(s1));
    }
}
