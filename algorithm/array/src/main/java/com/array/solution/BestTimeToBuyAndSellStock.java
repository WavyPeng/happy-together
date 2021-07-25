package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/25 14:02
 */
public class BestTimeToBuyAndSellStock {
    /**
     * 思路一：两层循环，比较返回最大值（会超时TT）
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > maxProfit) {
                    maxProfit = diff;
                }
            }
        }
        return maxProfit;
    }

    /**
     * 思路二：动态规划
     * 第i天能收获的最大利润等于第i天的价格减去i-1天中最小的价格，即：
     * maxProfit(i)=val(i)-minPrice
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minVal = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (maxProfit < prices[i] - minVal) {
                maxProfit = prices[i] - minVal;
            }
            if (prices[i] < minVal) {
                minVal = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit1(prices));

        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit1(prices1));
    }
}
