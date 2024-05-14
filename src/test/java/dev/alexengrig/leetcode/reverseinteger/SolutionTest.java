package dev.alexengrig.leetcode.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        int result = solution.reverse(123);
        assertEquals(321, result);
    }

    @Test
    void test2() {
        int result = solution.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    void test3() {
        int result = solution.reverse(120);
        assertEquals(21, result);
    }

    @Test
    void test4() {
        int result = solution.reverse(0);
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = solution.reverse(1534236469);
        assertEquals(0, result);
    }
}