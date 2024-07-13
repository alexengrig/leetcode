package dev.alexengrig.leetcode._714_best_time_to_buy_and_sell_stock_with_fee;

class Solution implements Task {
    @Override
    public int maxProfit(int[] prices, int fee) {
        int sell = 0, hold = -prices[0] - fee;
        for (int i = 1, n = prices.length; i < n; i++) {
            sell = Math.max(sell, hold + prices[i]);
            hold = Math.max(hold, sell - prices[i] - fee);
        }
        return sell;
    }
}
