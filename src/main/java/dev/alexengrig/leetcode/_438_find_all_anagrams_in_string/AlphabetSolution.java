package dev.alexengrig.leetcode._438_find_all_anagrams_in_string;

import java.util.ArrayList;
import java.util.List;

class AlphabetSolution implements Task {
    @Override
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        int[] counts = new int[26]; // English alphabet size
        for (char ch : p.toCharArray()) {
            counts[ch - 'a']++;
        }
        List<Integer> results = new ArrayList<>();
        int size = m;
        for (int l = 0, r = 0; r < n; r++) {
            if (--counts[s.charAt(r) - 'a'] >= 0) {
                size--;
            }
            while (size == 0) {
                if (r - l + 1 == m) {
                    results.add(l);
                }
                if (++counts[s.charAt(l) - 'a'] > 0) {
                    size++;
                }
                l++;
            }
        }
        return results;
    }
}
