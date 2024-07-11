package dev.alexengrig.leetcode._560_subarray_sum_equals_k;

class N2Solution implements Task {
    @Override
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0, n = nums.length; i < n; i++) {
            int sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
