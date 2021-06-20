package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/20 15:32
 */
public class ThousandSeparator {

    /**
     * 思路：
     * 将n从低位向高位遍历，每三位加一个分隔符，最后将获取的字符串反转即可。
     *
     * @param n
     * @return
     */
    public static String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        do {
            int num = n % 10;
            sb.append(num);
            count++;
            n /= 10;
            if (count % 3 == 0 && n != 0) {
                sb.append(".");
            }
        } while (n != 0);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n1 = 987;
        int n2 = 1234;
        int n3 = 123456789;
        int n4 = 0;
        int n5 = 1000;
        System.out.println(thousandSeparator(n1));
        System.out.println(thousandSeparator(n2));
        System.out.println(thousandSeparator(n3));
        System.out.println(thousandSeparator(n4));
        System.out.println(thousandSeparator(n5));
    }
}
