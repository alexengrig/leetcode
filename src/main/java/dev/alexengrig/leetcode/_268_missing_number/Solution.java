package dev.alexengrig.leetcode._268_missing_number;

class Solution implements Task {
    @Override
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res ^ nums.length;
    }
}
