package dev.alexengrig.leetcode._300_longest_increasing_subsequence;

class N2Solution implements Task {
    @Override
    public int lengthOfLIS(int[] nums) {
        int length = 0, n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int index = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && (index == -1 || dp[j] > dp[index])) {
                    index = j;
                }
            }
            dp[i] = 1 + (index != -1 ? dp[index] : 0);
            if (length < dp[i]) {
                length = dp[i];
            }
        }
        return length;
    }
}
