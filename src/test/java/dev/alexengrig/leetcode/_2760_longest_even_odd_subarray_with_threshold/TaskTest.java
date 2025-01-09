package dev.alexengrig.leetcode._2760_longest_even_odd_subarray_with_threshold;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {3, 2, 5, 4};
        int threshold = 5;
        assertEquals(3, solution.longestAlternatingSubarray(nums, threshold));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 2};
        int threshold = 2;
        assertEquals(1, solution.longestAlternatingSubarray(nums, threshold));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {2, 3, 4, 5};
        int threshold = 4;
        assertEquals(3, solution.longestAlternatingSubarray(nums, threshold));
    }
}