package dev.alexengrig.leetcode._136_single_number;

class Solution implements Task {
    @Override
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
