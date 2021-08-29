package dev.alexengrig.leetcode.solutions.palindromenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    static Solution solution = new Solution();

    void test(int x, boolean expected) {
        assertEquals(expected, solution.isPalindrome(x));
    }

    @Test
    void test0() {
        test(1221, true);
    }

    @Test
    void test1() {
        test(121, true);
    }

    @Test
    void test2() {
        test(-121, false);
    }

    @Test
    void test3() {
        test(10, false);
    }

    @Test
    void test4() {
        test(-101, false);
    }

    @Test
    void test5() {
        test(101, true);
    }

    @Test
    void test6() {
        test(1000021, false);
    }

    @Test
    void test7() {
        test(1000001, true);
    }

    @Test
    void test8() {
        test(10022201, false);
    }
}