package dev.alexengrig.leetcode._75_sort_colors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new CounterSolution()),
                Arguments.of(new IndexSolution()),
                Arguments.of(new SwapSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }
}