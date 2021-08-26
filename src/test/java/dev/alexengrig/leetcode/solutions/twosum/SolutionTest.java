package dev.alexengrig.leetcode.solutions.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    static Solution solution = new Solution();

    @Test
    void test1() {
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    void test2() {
        int[] ints = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void test3() {
        int[] ints = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, ints);
    }
}