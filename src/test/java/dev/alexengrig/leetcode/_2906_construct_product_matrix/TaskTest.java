package dev.alexengrig.leetcode._2906_construct_product_matrix;

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
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(
                new int[][]{
                        {24, 12},
                        {8, 6}
                },
                solution.constructProductMatrix(grid)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[][] grid = {
                {12345},
                {2},
                {1}
        };
        assertArrayEquals(
                new int[][]{
                        {2},
                        {0},
                        {0}
                },
                solution.constructProductMatrix(grid)
        );
    }
}