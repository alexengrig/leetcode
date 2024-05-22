package dev.alexengrig.leetcode._238_product_of_array_except_self;

public class Solution implements Task {
    @Override
    public int[] productExceptSelf(int[] nums) {
        final int n = nums.length;
        int[] results = new int[n];
        results[0] = 1;
        for (int i = 1; i < n; i++) {
            results[i] = results[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            results[i] *= suffix;
            suffix *= nums[i];
        }
        return results;
    }
}
