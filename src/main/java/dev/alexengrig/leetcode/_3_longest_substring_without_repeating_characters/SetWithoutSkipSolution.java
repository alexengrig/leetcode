package dev.alexengrig.leetcode._3_longest_substring_without_repeating_characters;

import java.util.HashSet;

public class SetWithoutSkipSolution implements Task {
    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 0, count = 0;
        for (int i = 0, start = i + 1, l = chars.length; i < l; i++) {
            if (set.contains(chars[i])) {
                if (count > max) {
                    max = count;
                }
                set = new HashSet<>();
                count = 0;
                i = start;
                start++; // skip
            }
            set.add(chars[i]);
            count++;
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}
