package dev.alexengrig.leetcode._567_permutation_in_string;

import java.util.HashMap;
import java.util.Map;

class MapWithEqualsSolution implements Task {
    @Override
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            s1Map.compute(ch, (k, count) -> count == null ? 1 : count + 1);
        }
        Map<Character, Integer> s2Map = new HashMap<>();
        int right = 0;
        for (int n = s1.length(); right < n; right++) {
            s2Map.compute(s2.charAt(right), (k, count) -> count == null ? 1 : count + 1);
        }
        if (s1Map.equals(s2Map)) {
            return true;
        }
        for (int left = 0, n = s2.length(); right < n; left++, right++) {
            s2Map.compute(s2.charAt(left), (k, count) -> count == null || count == 1 ? null : count - 1);
            s2Map.compute(s2.charAt(right), (k, count) -> count == null ? 1 : count + 1);
            if (s1Map.equals(s2Map)) {
                return true;
            }
        }
        return false;
    }
}
