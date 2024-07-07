package dev.alexengrig.leetcode._1466_reorder_routes_to_lead_to_city_zero;

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
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        assertEquals(3, solution.minReorder(n, connections));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int n = 5;
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        assertEquals(2, solution.minReorder(n, connections));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int n = 3;
        int[][] connections = {{1, 0}, {2, 0}};
        assertEquals(0, solution.minReorder(n, connections));
    }
}