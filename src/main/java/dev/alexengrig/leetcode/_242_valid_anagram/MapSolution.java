package dev.alexengrig.leetcode._242_valid_anagram;

import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (key, count) -> count == null ? 1 : count + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer res = map.compute(t.charAt(i), (key, count) -> count == null
                    ? Integer.valueOf(-1)
                    : count == 1 ? null : count - 1);
            if (res != null && res == -1) {
                return false;
            }
        }
        return map.isEmpty();
    }
}
