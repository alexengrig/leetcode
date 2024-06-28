package dev.alexengrig.leetcode._849_maximize_distance_to_closest_person;

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
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, solution.maxDistToClosest(seats));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] seats = {1, 0, 0, 0};
        assertEquals(3, solution.maxDistToClosest(seats));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] seats = {0, 1};
        assertEquals(1, solution.maxDistToClosest(seats));
    }
}