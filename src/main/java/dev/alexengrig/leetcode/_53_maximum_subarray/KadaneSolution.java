package dev.alexengrig.leetcode._53_maximum_subarray;

class KadaneSolution implements Task {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = Math.max(nums[0], 0);
        for (int i = 1, n = nums.length; i < n; i++) {
            maxEndingHere += nums[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
