package dev.alexengrig.leetcode._121_best_time_to_buy_and_sell_stock;

class Solution implements Task {
    @Override
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0], price;
        for (int i = 1, n = prices.length; i < n; i++) {
            price = prices[i];
            profit = Math.max(profit, price - min);
            min = Math.min(min, price);
        }
        return profit;
    }
}
