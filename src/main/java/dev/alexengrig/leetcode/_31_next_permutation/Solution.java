package dev.alexengrig.leetcode._31_next_permutation;

class Solution implements Task {
    @Override
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }
        if (left >= 0) {
            int right = nums.length - 1;
            while (nums[left] >= nums[right]) {
                right--;
            }
            swap(nums, left, right);
        }
        for (int l = left + 1, r = nums.length - 1; l < r; l++, r--) {
            swap(nums, l, r);
        }
    }

    void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
