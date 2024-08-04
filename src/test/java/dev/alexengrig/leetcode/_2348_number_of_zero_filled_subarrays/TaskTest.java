package dev.alexengrig.leetcode._2348_number_of_zero_filled_subarrays;

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
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        assertEquals(6, solution.zeroFilledSubarray(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 0, 0, 2, 0, 0};
        assertEquals(9, solution.zeroFilledSubarray(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {2, 10, 2019};
        assertEquals(0, solution.zeroFilledSubarray(nums));
    }
}