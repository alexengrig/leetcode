package dev.alexengrig.leetcode._300_longest_increasing_subsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new NLogNSolution()),
                Arguments.of(new N2Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 1, 0, 3, 2, 3};
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, solution.lengthOfLIS(nums));
    }
}