package dev.alexengrig.leetcode.premium._487_max_consecutive_ones2;

class Solution implements Task {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int l = 0, r = 0, zeros = 0, n = nums.length; r < n; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[l++] == 0) {
                    zeros--;
                }
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
