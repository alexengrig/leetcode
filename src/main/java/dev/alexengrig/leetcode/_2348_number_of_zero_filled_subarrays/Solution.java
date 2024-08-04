package dev.alexengrig.leetcode._2348_number_of_zero_filled_subarrays;

class Solution implements Task {
    @Override
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        for (int curr = 0, preZero = -1, n = nums.length; curr < n; curr++) {
            if (nums[curr] == 0) {
                count += curr - preZero;
            } else {
                preZero = curr;
            }
        }
        return count;
    }
}
