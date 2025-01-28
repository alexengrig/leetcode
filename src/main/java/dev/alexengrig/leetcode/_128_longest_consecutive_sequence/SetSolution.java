package dev.alexengrig.leetcode._128_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

class SetSolution implements Task {
    @Override
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
