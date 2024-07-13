package dev.alexengrig.leetcode._309_best_time_to_buy_and_sell_stock_with_cooldown;

class Solution implements Task {
    @Override
    public int maxProfit(int[] prices) {
        int sell = 0, prevSell = 0, hold = -prices[0];
        for (int i = 1, n = prices.length; i < n; i++) {
            int tmp = sell;
            sell = Math.max(sell, hold + prices[i]);
            hold = Math.max(hold, prevSell - prices[i]);
            prevSell = tmp;
        }
        return sell;
    }
}
