package com.offer.solution;

/**
 * @Author pengweiwei
 * @Date 2021/4/5 21:13
 */
public class Solution05 {
    /**
     * 方法一：replace
     *
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    /**
     * 方法二：split
     *
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sList = s.split(" ");
        for (int i = 0; i < sList.length; i++) {
            sb.append(sList[i]);
            if (i < sList.length - 1) {
                sb.append("20%");
            }
        }
        return sb.toString();
    }

    /**
     * 方法三：创建额外数组，逐字符遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param s
     * @return
     */
    public static String replaceSpace2(String s) {
        char[] charArray = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                charArray[size++] = '2';
                charArray[size++] = '0';
                charArray[size++] = '%';
            } else {
                charArray[size++] = s.charAt(i);
            }
        }
        String res = new String(charArray, 0, size);
        return res;
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
        System.out.println(replaceSpace1(s));
        System.out.println(replaceSpace2(s));
    }
}
