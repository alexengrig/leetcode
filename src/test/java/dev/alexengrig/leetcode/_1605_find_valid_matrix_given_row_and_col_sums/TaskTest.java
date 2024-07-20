package dev.alexengrig.leetcode._1605_find_valid_matrix_given_row_and_col_sums;

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
        int[] rowSum = {3, 8};
        int[] colSum = {4, 7};
        assertArrayEquals(new int[][]{{3, 0}, {1, 7}}, solution.restoreMatrix(rowSum, colSum));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] rowSum = {5, 7, 10};
        int[] colSum = {8, 6, 8};
        assertArrayEquals(new int[][]{{5, 0, 0}, {3, 4, 0}, {0, 2, 8}}, solution.restoreMatrix(rowSum, colSum));
    }
}