package dev.alexengrig.leetcode._209_minimum_size_subarray_sum;

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
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        assertEquals(2, solution.minSubArrayLen(target, nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 4, 4};
        int target = 4;
        assertEquals(1, solution.minSubArrayLen(target, nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        assertEquals(0, solution.minSubArrayLen(target, nums));
    }
}