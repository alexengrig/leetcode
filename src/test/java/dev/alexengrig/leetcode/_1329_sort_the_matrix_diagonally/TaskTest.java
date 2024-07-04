package dev.alexengrig.leetcode._1329_sort_the_matrix_diagonally;

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
        int[][] mat = {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        };
        assertArrayEquals(new int[][]{
                {1, 1, 1, 1},
                {1, 2, 2, 2},
                {1, 2, 3, 3}
        }, solution.diagonalSort(mat));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[][] mat = {
                {11, 25, 66, 1, 69, 7},
                {23, 55, 17, 45, 15, 52},
                {75, 31, 36, 44, 58, 8},
                {22, 27, 33, 25, 68, 4},
                {84, 28, 14, 11, 5, 50}
        };
        assertArrayEquals(new int[][]{
                {5, 17, 4, 1, 52, 7},
                {11, 11, 25, 45, 8, 69},
                {14, 23, 25, 44, 58, 15},
                {22, 27, 31, 36, 50, 66},
                {84, 28, 75, 33, 55, 68}
        }, solution.diagonalSort(mat));
    }
}