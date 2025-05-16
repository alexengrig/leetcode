package dev.alexengrig.leetcode._84_largest_rectangle_in_istogram;

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
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, solution.largestRectangleArea(heights));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] heights = {2, 4};
        assertEquals(4, solution.largestRectangleArea(heights));
    }
}