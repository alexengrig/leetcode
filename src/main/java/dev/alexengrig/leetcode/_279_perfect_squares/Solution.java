package dev.alexengrig.leetcode._279_perfect_squares;

public class Solution implements Task {
    @Override
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int num = 1, sqr; (sqr = num * num) <= n; num++) {
            for (int i = sqr; i <= n; i++) {
                if (dp[i] == 0) {
                    dp[i] = dp[i - sqr] + 1;
                } else {
                    dp[i] = Math.min(dp[i], dp[i - sqr] + 1);
                }
            }
        }
        return dp[n];
    }
}
