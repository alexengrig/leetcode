package dev.alexengrig.leetcode._53_maximum_subarray;

class DPSolution implements Task {
    @Override
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] is max sum of [0, i]
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
