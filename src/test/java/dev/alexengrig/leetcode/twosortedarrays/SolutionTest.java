package dev.alexengrig.leetcode.twosortedarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        double result = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assertEquals(2d, result, 1e-1);
    }

    @Test
    void test2() {
        double result = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assertEquals(2.5d, result, 1e-1);
    }

    @Test
    void test3() {
        double result = solution.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0});
        assertEquals(0d, result, 1e-1);
    }

    @Test
    void test4() {
        double result = solution.findMedianSortedArrays(new int[]{}, new int[]{1});
        assertEquals(1d, result, 1e-1);
    }

    @Test
    void test5() {
        double result = solution.findMedianSortedArrays(new int[]{2}, new int[]{});
        assertEquals(2d, result, 1e-1);
    }
}