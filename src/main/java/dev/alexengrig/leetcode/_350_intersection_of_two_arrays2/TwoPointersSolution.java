package dev.alexengrig.leetcode._350_intersection_of_two_arrays2;

import java.util.Arrays;

class TwoPointersSolution implements Task {
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0, n = nums1.length, m = nums2.length;
        int[] results = new int[Math.min(n, m)];
        for (int i = 0, j = 0; i < n && j < m; ) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                results[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(results, index);
    }
}
