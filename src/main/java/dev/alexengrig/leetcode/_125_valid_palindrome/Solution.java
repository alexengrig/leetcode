package dev.alexengrig.leetcode._125_valid_palindrome;

class Solution implements Task {
    @Override
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int l = 0, r = chars.length - 1; l < r; l++, r--) {
            while (l < r && !Character.isLetterOrDigit(chars[l])) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(chars[r])) {
                r--;
            }
            if (Character.toUpperCase(chars[l]) != Character.toUpperCase(chars[r])) {
                return false;
            }
        }
        return true;
    }
}
