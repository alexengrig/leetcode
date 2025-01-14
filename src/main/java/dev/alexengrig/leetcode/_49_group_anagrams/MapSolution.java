package dev.alexengrig.leetcode._49_group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> subMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                subMap.compute(str.charAt(i), (key, count) -> count == null ? 1 : count + 1);
            }
            map.computeIfAbsent(subMap, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
