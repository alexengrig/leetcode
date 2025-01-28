package dev.alexengrig.leetcode._128_longest_consecutive_sequence;

import java.util.HashMap;
import java.util.Map;

public class MapSolution implements Task {
    @Override
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int leftLen = map.getOrDefault(num - 1, 0);
                int rightLen = map.getOrDefault(num + 1, 0);
                int curLen = 1 + leftLen + rightLen;
                map.put(num, curLen);
                if (leftLen != 0) {
                    map.put(num - leftLen, curLen);
                }
                if (rightLen != 0) {
                    map.put(num + rightLen, curLen);
                }
                max = Math.max(max, curLen);
            }
        }
        return max;
    }
}
