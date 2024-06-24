package dev.alexengrig.leetcode._438_find_all_anagrams_in_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AlphabetSolution implements Task {
    @Override
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (pLen > sLen) {
            return List.of();
        }
        int[] pCounts = new int[26]; // English alphabet size
        for (char ch : p.toCharArray()) {
            pCounts[ch - 'a']++;
        }
        int[] sCounts = new int[26];
        int right = 0;
        for (; right < pLen; right++) {
            sCounts[s.charAt(right) - 'a']++;
        }
        List<Integer> results = new ArrayList<>();
        if (Arrays.equals(pCounts, sCounts)) {
            results.add(0);
        }
        for (int left = 1; right < sLen; left++, right++) {
            sCounts[s.charAt(left - 1) - 'a']--;
            sCounts[s.charAt(right) - 'a']++;
            if (Arrays.equals(pCounts, sCounts)) {
                results.add(left);
            }
        }
        return results;
    }
}
