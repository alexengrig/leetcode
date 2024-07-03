package dev.alexengrig.leetcode._350_intersection_of_two_arrays2;

import java.util.Arrays;

class BinarySearchSolution implements Task {
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] shortNums, nums;
        if (nums1.length <= nums2.length) {
            shortNums = nums1;
            nums = nums2;
        } else {
            shortNums = nums2;
            nums = nums1;
        }
        Arrays.sort(shortNums);
        Arrays.sort(nums);
        int[] results = new int[shortNums.length];
        int index = 0, left = 0, i;
        for (int num : shortNums) {
            i = findIndex(nums, num, left);
            if (i < nums.length && nums[i] == num) {
                results[index++] = num;
                left = i + 1;
            }
        }
        return Arrays.copyOf(results, index);
    }

    int findIndex(int[] nums, int target, int begin) {
        int l = begin, r = nums.length, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
