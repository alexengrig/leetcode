package dev.alexengrig.leetcode._2215_find_the_difference_of_two_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution implements Task {
    @Override
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        return List.of(list1, list2);
    }
}
