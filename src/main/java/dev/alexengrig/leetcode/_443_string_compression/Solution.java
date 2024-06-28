package dev.alexengrig.leetcode._443_string_compression;

class Solution implements Task {
    @Override
    public int compress(char[] chars) {
        int n = chars.length, left = 0, right = 0, count;
        char ch;
        while (right < n) {
            ch = chars[right];
            count = 0;
            do {
                right++;
                count++;
            } while (right < n && ch == chars[right]);
            chars[left++] = ch;
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[left++] = digit;
                }
            }
        }
        return left;
    }
}
