package dev.alexengrig.leetcode._3_longest_substring_without_repeating_characters;

import java.util.HashSet;

class SetSolution implements Task {
    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max = 0, count = 0;
        for (int i = 0, start = i, l = chars.length; i < l; i++) {
            if (set.contains(chars[i])) {
                if (count > max) {
                    max = count;
                }
                set = new HashSet<>();
                count = 0;
                if (chars[i] == chars[start]) {
                    do {
                        i++;
                        start++;
                    } while (i < l && chars[i] == chars[start]);
                } else {
                    start++;
                }
                i = start;
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
