package dev.alexengrig.leetcode._3_longest_substring_without_repeating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    void test4() {
        int result = solution.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = solution.lengthOfLongestSubstring("au");
        assertEquals(2, result);
    }

    @Test
    void test6() {
        int result = solution.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }
}