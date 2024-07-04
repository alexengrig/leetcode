package dev.alexengrig.leetcode._1004_max_consecutive_ones3;

class Solution implements Task {
    @Override
    public int longestOnes(int[] nums, int k) {
        int max = 0, zeros = 0, size;
        for (int l = 0, r = 0, n = nums.length; r < n; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[l++] == 0) {
                    zeros--;
                }
            }
            size = r - l + 1;
            if (max < size) {
                max = size;
            }
        }
        return max;
    }
}
