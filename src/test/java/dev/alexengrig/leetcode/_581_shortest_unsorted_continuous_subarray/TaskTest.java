package dev.alexengrig.leetcode._581_shortest_unsorted_continuous_subarray;

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
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, solution.findUnsortedSubarray(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 2, 3, 4};
        assertEquals(0, solution.findUnsortedSubarray(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1};
        assertEquals(0, solution.findUnsortedSubarray(nums));
    }
}