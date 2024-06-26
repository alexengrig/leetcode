package dev.alexengrig.leetcode._56_merge_intervals;

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
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, solution.merge(intervals));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[][] intervals = {{1, 4}, {4, 5}};
        assertArrayEquals(new int[][]{{1, 5}}, solution.merge(intervals));
    }
}