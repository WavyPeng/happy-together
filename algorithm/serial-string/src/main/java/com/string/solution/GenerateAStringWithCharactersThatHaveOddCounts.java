package com.string.solution;

import java.util.Arrays;

/**
 * @Author pengweiwei
 * @Date 2021/6/6 21:51
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {
    /**
     * 思路：
     * 由于不限制返回字符串的字符内容，因此：
     * 1.当n为奇数时，字符串的各字符全部设置为a；
     * 2.当n为偶数时，将n-1个字符设为a，1个字符设为b即可；
     *
     * @param n
     * @return
     */
    public static String generateTheString(int n) {
        char[] cs = new char[n];
        Arrays.fill(cs, 'a');
        if (n % 2 == 0) {
            cs[n - 1] = 'b';
        }
        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateTheString(n));
    }
}
