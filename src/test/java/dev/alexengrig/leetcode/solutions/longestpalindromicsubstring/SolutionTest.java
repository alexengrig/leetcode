package dev.alexengrig.leetcode.solutions.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        String result = solution.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    void test2() {
        String result = solution.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    void test3() {
        String result = solution.longestPalindrome("a");
        assertEquals("a", result);
    }

    @Test
    void test4() {
        String result = solution.longestPalindrome("ac");
        assertEquals("a", result);
    }
}