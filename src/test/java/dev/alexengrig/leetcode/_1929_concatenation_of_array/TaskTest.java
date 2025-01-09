package dev.alexengrig.leetcode._1929_concatenation_of_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 2, 1};
        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 3, 2, 1};
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }
}