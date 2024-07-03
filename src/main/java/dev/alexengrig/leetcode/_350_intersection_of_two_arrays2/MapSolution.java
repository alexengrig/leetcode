package dev.alexengrig.leetcode._350_intersection_of_two_arrays2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
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
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : shortNums) {
            counts.compute(num, (k, count) -> count == null ? 1 : count + 1);
        }
        int[] results = new int[shortNums.length];
        int index = 0;
        for (int i = 0, n = nums.length; !counts.isEmpty() && i < n; i++) {
            if (counts.containsKey(nums[i])) {
                counts.compute(nums[i], (k, count) -> count == null || count == 1 ? null : count - 1);
                results[index++] = nums[i];
            }
        }
        return Arrays.copyOf(results, index);
    }
}
