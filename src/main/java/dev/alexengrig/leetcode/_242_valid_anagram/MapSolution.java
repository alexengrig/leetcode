package dev.alexengrig.leetcode._242_valid_anagram;

import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0, n = s.length(); i < n; i++) {
            sMap.compute(s.charAt(i), (k, count) -> count == null ? 1 : 1 + count);
            tMap.compute(t.charAt(i), (k, count) -> count == null ? 1 : 1 + count);
        }
        return sMap.equals(tMap);
    }
}
