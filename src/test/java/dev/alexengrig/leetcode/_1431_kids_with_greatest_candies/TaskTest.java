package dev.alexengrig.leetcode._1431_kids_with_greatest_candies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
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
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        assertEquals(
                List.of(true, true, true, false, true),
                solution.kidsWithCandies(candies, extraCandies)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        assertEquals(
                List.of(true, false, false, false, false),
                solution.kidsWithCandies(candies, extraCandies)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        assertEquals(
                List.of(true, false, true),
                solution.kidsWithCandies(candies, extraCandies)
        );
    }
}