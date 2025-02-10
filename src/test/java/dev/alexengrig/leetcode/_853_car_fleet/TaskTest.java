package dev.alexengrig.leetcode._853_car_fleet;

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
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        assertEquals(3, solution.carFleet(target, position, speed));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int target = 10;
        int[] position = {3};
        int[] speed = {3};
        assertEquals(1, solution.carFleet(target, position, speed));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int target = 100;
        int[] position = {0, 2, 4};
        int[] speed = {4, 2, 1};
        assertEquals(1, solution.carFleet(target, position, speed));
    }
}