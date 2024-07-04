package dev.alexengrig.leetcode._896_monotonic_array;

public class Solution implements Task {
    @Override
    public boolean isMonotonic(int[] nums) {
        int inc = 0, dec = 0;
        for (int i = 1, n = nums.length; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                inc++;
            } else if (nums[i - 1] > nums[i]) {
                dec++;
            }
        }
        return inc == 0 || dec == 0;
    }
}
