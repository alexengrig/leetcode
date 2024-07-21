package dev.alexengrig.leetcode._209_minimum_size_subarray_sum;

class Solution implements Task {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, n = nums.length, len = n + 1;
        for (int l = 0, r = 0; r < n; r++) {
            sum += nums[r];
            while (sum >= target) {
                len = Math.min(len, r - l + 1);
                sum -= nums[l++];
            }
        }
        return len <= n ? len : 0;
    }
}
