package dev.alexengrig.leetcode._75_sort_colors;

class SwapSolution implements Task {
    @Override
    public void sortColors(int[] nums) {
        int index = 0, left = 0, right = nums.length - 1;
        while (index <= right) {
            if (nums[index] == 0) {
                swap(nums, index++, left++);
            } else if (nums[index] == 1) {
                index++;
            } else {
                swap(nums, index, right--);
            }
        }
    }

    void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
