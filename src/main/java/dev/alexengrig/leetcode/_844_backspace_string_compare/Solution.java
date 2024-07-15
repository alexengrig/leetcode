package dev.alexengrig.leetcode._844_backspace_string_compare;

class Solution implements Task {
    @Override
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        while (true) {
            int backspace = 0;
            while (i >= 0 && (s.charAt(i) == '#' || backspace > 0)) {
                if (s.charAt(i) == '#') {
                    ++backspace;
                } else {
                    --backspace;
                }
                --i;
            }
            backspace = 0;
            while (j >= 0 && (t.charAt(j) == '#' || backspace > 0)) {
                if (t.charAt(j) == '#') {
                    ++backspace;
                } else {
                    --backspace;
                }
                --j;
            }
            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                --i;
                --j;
            } else {
                return i == -1 && j == -1;
            }
        }
    }
}
