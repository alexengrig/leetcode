package dev.alexengrig.leetcode._977_squares_of_sorted_array;

class Solution implements Task {
    @Override
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        for (int i = n - 1, l = 0, r = n - 1; i >= 0; i--) {
            int lSquare = nums[l] * nums[l];
            int rSquare = nums[r] * nums[r];
            if (lSquare >= rSquare) {
                results[i] = lSquare;
                l++;
            } else {
                results[i] = rSquare;
                r--;
            }
        }
        return results;
    }
}
