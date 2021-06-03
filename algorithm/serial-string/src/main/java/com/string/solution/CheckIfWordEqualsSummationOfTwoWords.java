package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/3 22:15
 */
public class CheckIfWordEqualsSummationOfTwoWords {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (Character c : firstWord.toCharArray()) {
            sb1.append((Integer) (c - 'a'));
        }
        for (Character c : secondWord.toCharArray()) {
            sb2.append((Integer) (c - 'a'));
        }
        for (Character c : targetWord.toCharArray()) {
            sb3.append((Integer) (c - 'a'));
        }
        Integer num1 = Integer.parseInt(sb1.toString());
        Integer num2 = Integer.parseInt(sb2.toString());
        Integer num3 = Integer.parseInt(sb3.toString());
        return num1 + num2 == num3;
    }

    public static void main(String[] args) {
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aab";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }
}
