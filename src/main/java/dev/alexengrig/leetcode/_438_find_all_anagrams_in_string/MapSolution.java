package dev.alexengrig.leetcode._438_find_all_anagrams_in_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (pLen > sLen) {
            return List.of();
        }
        Map<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.compute(ch, (k, count) -> count == null ? 1 : count + 1);
        }
        List<Integer> results = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int right = 0;
        for (; right < pLen; right++) {
            sMap.compute(s.charAt(right), (k, count) -> count == null ? 1 : count + 1);
        }
        if (pMap.equals(sMap)) {
            results.add(0);
        }
        for (int left = 1; right < sLen; left++, right++) {
            sMap.compute(s.charAt(left - 1), (k, count) -> count == null || count == 1 ? null : count - 1);
            sMap.compute(s.charAt(right), (k, count) -> count == null ? 1 : count + 1);
            if (pMap.equals(sMap)) {
                results.add(left);
            }
        }
        return results;
    }
}
