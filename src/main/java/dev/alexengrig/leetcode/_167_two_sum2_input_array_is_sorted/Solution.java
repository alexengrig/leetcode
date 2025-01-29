package dev.alexengrig.leetcode._167_two_sum2_input_array_is_sorted;

class Solution implements Task {
    @Override
    public int[] twoSum(int[] numbers, int target) {
        int sum, l = 0, r = numbers.length - 1;
        while ((sum = numbers[l] + numbers[r]) != target) {
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{l + 1, r + 1};
    }
}
