package dev.alexengrig.leetcode.zigzagconversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        String result = solution.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void test2() {
        String result = solution.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void test3() {
        String result = solution.convert("A", 1);
        assertEquals("A", result);
    }
    @Test
    void test4() {
        String result = solution.convert("ABC", 2);
        assertEquals("ACB", result);
    }
}