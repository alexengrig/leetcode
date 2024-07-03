package dev.alexengrig.leetcode._557_reverse_words_in_string3;

class Solution implements Task {
    @Override
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length, l = 0;
        for (int r = 0; r < n; r++) {
            if (chars[r] == ' ') {
                reverse(chars, l, r - 1);
                l = r + 1;
            }
        }
        reverse(chars, l, n - 1);
        return new String(chars);
    }

    void reverse(char[] chars, int begin, int end) {
        int l = begin, r = end;
        char tmp;
        for (; l < r; l++, r--) {
            tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
        }
    }
}
