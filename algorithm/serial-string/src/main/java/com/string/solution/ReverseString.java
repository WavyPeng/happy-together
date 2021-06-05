package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/5 20:45
 */
public class ReverseString {

    public static void reverseString(char[] s) {
        char tmp;
        int i = 0, j = s.length - 1;
        while (i < j) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s1);
        reverseString(s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
