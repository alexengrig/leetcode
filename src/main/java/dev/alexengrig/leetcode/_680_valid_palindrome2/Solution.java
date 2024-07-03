package dev.alexengrig.leetcode._680_valid_palindrome2;

class Solution implements Task {
    @Override
    public boolean validPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
            }
        }
        return true;
    }

    boolean validPalindrome(String s, int begin, int end) {
        for (int l = begin, r = end; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }
}
