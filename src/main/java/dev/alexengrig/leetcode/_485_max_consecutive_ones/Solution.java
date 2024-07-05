package dev.alexengrig.leetcode._485_max_consecutive_ones;

class Solution implements Task {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, ones = 0;
        for (int num : nums) {
            if (num == 1) {
                ones++;
                if (max < ones) {
                    max = ones;
                }
            } else {
                ones = 0;
            }
        }
        return max;
    }
}
