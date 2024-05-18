package dev.alexengrig.leetcode._1909_remove_element_to_array_increasing;

public class BinarySearchSolution implements Task {
    @Override
    public boolean canBeIncreasing(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid - 1] < nums[mid]) {

            }
        }
        return false;
        //1, 2, 10, 5, 7
        //0 4 = 2

    }
}
