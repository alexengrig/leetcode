package dev.alexengrig.leetcode._128_longest_consecutive_sequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new SetSolution()),
                Arguments.of(new MapSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(4, solution.longestConsecutive(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, solution.longestConsecutive(nums));
    }
}