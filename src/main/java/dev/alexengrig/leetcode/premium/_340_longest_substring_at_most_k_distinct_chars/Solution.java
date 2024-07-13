package dev.alexengrig.leetcode.premium._340_longest_substring_at_most_k_distinct_chars;

import java.util.HashMap;
import java.util.Map;

class Solution implements Task {
    @Override
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int max = 0;
        for (int l = 0, r = 0, n = s.length(); r < n; r++) {
            counts.compute(s.charAt(r), (key, count) -> count == null ? 1 : count + 1);
            while (counts.size() > k) {
                counts.compute(s.charAt(l++), (key, count) -> count == null || count == 1 ? null : count - 1);
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
