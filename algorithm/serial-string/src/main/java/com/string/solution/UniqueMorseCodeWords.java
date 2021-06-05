package com.string.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author pengweiwei
 * @Date 2021/6/5 18:36
 */
public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        List<String> morse = Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(morse.get((words[i].charAt(j) - 'a')));
            }
            strSet.add(sb.toString());
        }
        return strSet.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
