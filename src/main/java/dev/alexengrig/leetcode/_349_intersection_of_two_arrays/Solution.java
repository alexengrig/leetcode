package dev.alexengrig.leetcode._349_intersection_of_two_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution implements Task {
    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] shortNums, nums;
        if (nums1.length <= nums2.length) {
            shortNums = nums1;
            nums = nums2;
        } else {
            shortNums = nums2;
            nums = nums1;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : shortNums) {
            set.add(num);
        }
        int index = 0;
        int[] results = new int[shortNums.length];
        for (int num : nums) {
            if (set.remove(num)) {
                results[index++] = num;
            }
        }
        return Arrays.copyOf(results, index);
    }
}
