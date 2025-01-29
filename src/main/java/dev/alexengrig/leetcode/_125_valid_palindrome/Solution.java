package dev.alexengrig.leetcode._125_valid_palindrome;

class Solution implements Task {
    @Override
    public boolean isPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r))) {
                return false;
            }
        }
        return true;
    }
}
