package dev.alexengrig.leetcode._1493_longest_subarray_1_after_deleting_element;

class Solution implements Task {
    @Override
    public int longestSubarray(int[] nums) {
        int max = 0, zeros = 0;
        for (int left = 0, right = 0, n = nums.length; right < n; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
