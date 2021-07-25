package com.array.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/25 14:39
 */
public class BestTimeToBuyAndSellStockII {
    /**
     * 思路一：贪心算法
     * 由于可以多次买入卖出，因此只要今天比昨天的价格高，就可以卖出
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }

    /**
     * 思路二：动态规划
     * 假设dp0是交易完成后，手里不持股的最大利润；dp1是交易完成后，手里持股的最大利润；
     * 那么第i天交易完成后，
     * 不持股的最大利润：dp0[i]=max{dp0[i-1],dp1[i-1]+price[i]}
     * 持股的最大利润：dp1[i]=max{dp1[i-1],dp0[i-1]-price[i]}
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        // 不持有股票
        int dp0 = 0;
        // 持有股票
        int dp1 = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int tmpDp0 = Math.max(dp0, dp1 + prices[i]);
            int tmpDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = tmpDp0;
            dp1 = tmpDp1;
        }
        return dp0;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("----贪心算法----");
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
        System.out.println("----动态规划----");
        System.out.println(maxProfit1(prices1));
        System.out.println(maxProfit1(prices2));
        System.out.println(maxProfit1(prices3));
    }
}
