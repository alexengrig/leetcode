package dev.alexengrig.leetcode._2760_longest_even_odd_subarray_with_threshold;

class Solution implements Task {
    @Override
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0, l = 0;
        while (l < n) {
            if (nums[l] <= threshold && nums[l] % 2 == 0) {
                int r = l + 1;
                while (r < n && nums[r] <= threshold && nums[r - 1] % 2 != nums[r] % 2) {
                    r++;
                }
                max = Math.max(max, r - l);
                l = r;
            } else {
                l++;
            }
        }
        return max;
    }
}
