package dev.alexengrig.leetcode._205_isomorphic_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution implements Task {
    @Override
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0, n = s.length(); i < n; i++) {
            if (!Objects.equals(sMap.put(s.charAt(i), i), tMap.put(t.charAt(i), i))) {
                return false;
            }
        }
        return true;
    }
}
