package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/15 22:57
 */
public class MaximumNumberOfBalloons {
    /**
     * 思路：
     * 记录字符串中每个字母出现的次数，然后遍历balloon找出balon字母出现次数的最小值（注意l、o需要除2）
     *
     * @param text
     * @return
     */
    public static int maxNumberOfBalloons(String text) {
        int[] nums = new int[26];
        for (int i = 0; i < text.length(); i++) {
            nums[text.charAt(i) - 'a']++;
        }
        String s = "balon";
        int res = nums[s.charAt(0) - 'a'];
        for (int i = 0; i < s.length(); i++) {
            int tmp = nums[s.charAt(i) - 'a'];
            if (s.charAt(i) == 'l' || s.charAt(i) == 'o') {
                res = Math.min(res, tmp / 2);
            } else {
                res = Math.min(res, tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String text1 = "nlaebolko";
        String text2 = "loonbalxballpoon";
        String text3 = "leetcode";
        System.out.println(maxNumberOfBalloons(text1));
        System.out.println(maxNumberOfBalloons(text2));
        System.out.println(maxNumberOfBalloons(text3));
    }
}
