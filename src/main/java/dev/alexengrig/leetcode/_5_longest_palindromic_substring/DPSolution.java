package dev.alexengrig.leetcode._5_longest_palindromic_substring;

class DPSolution implements Task {
    @Override
    public String longestPalindrome(String s) {
        int n = s.length();
        // dp[i][j] - substring [i, j] is NOT palindrome
        boolean[][] dp = new boolean[n][n];
        int begin = 0, len = 1;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = true;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (!dp[i][j] && len < j - i + 1) {
                        begin = i;
                        len = j - i + 1;
                    }
                }
            }
        }
        return s.substring(begin, begin + len);
    }
}
