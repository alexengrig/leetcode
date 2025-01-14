package dev.alexengrig.leetcode._49_group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ArraySolution implements Task {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] counts = new char[26];
            for (int i = 0; i < str.length(); i++) {
                counts[str.charAt(i) - 'a']++;
            }
            map.computeIfAbsent(new String(counts), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
