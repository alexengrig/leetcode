package dev.alexengrig.leetcode._605_can_place_flowers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(solution.canPlaceFlowers(flowerbed, n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] flowerbed = {0};
        int n = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int[] flowerbed = {1};
        int n = 0;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int[] flowerbed = {0, 0, 0};
        int n = 2;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test5(Task solution) {
        int[] flowerbed = {1, 0};
        int n = 1;
        assertFalse(solution.canPlaceFlowers(flowerbed, n));
    }
}