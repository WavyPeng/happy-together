package com.string.solution;

import java.util.Stack;

/**
 * @Author pengweiwei
 * @Date 2021/6/6 15:53
 */
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            } else {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
        }
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
