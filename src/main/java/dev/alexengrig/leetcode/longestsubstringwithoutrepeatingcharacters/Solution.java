package dev.alexengrig.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;

class Solution {
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

    public int lengthOfLongestSubstringWithoutSkipping(String s) {
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
