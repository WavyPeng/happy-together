package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/5/30 22:52
 */
public class SplitAStringInBalancedStrings {
    /**
     * 思路：
     * 遍历字符串，由于平衡子串中L和R的个数相等，因此在遍历时用n标记L和R出现的次数；
     * 当出现L时，n++；
     * 当出现R时，n--；
     * 当n=0时，表示L和R的个数相等，则此时出现一个平衡子串；
     *
     * @param s
     * @return
     */
    public static int balancedStringSplit(String s) {
        int n = 0, balanceStrNum = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                n++;
            } else {
                n--;
            }
            if (n == 0) {
                balanceStrNum++;
            }
        }
        return balanceStrNum;
    }

    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL";
        String s2 = "RLLLLRRRLR";
        String s3 = "LLLLRRRR";
        String s4 = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s1));
        System.out.println(balancedStringSplit(s2));
        System.out.println(balancedStringSplit(s3));
        System.out.println(balancedStringSplit(s4));
    }
}
