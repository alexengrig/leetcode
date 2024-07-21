package dev.alexengrig.leetcode._167_two_sum2_input_array_is_sorted;

class Solution implements Task {
    @Override
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length, l = 0, r = n - 1;
        while (numbers[l] + numbers[r] != target) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{l + 1, r + 1};
    }
}
