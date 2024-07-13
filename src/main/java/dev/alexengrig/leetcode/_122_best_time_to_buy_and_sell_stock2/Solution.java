package dev.alexengrig.leetcode._122_best_time_to_buy_and_sell_stock2;

public class Solution implements Task {
    @Override
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1, n = prices.length; i < n; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profit;
    }
}
