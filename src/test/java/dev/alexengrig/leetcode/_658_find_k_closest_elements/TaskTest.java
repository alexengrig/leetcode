package dev.alexengrig.leetcode._658_find_k_closest_elements;

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
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        assertEquals(List.of(1, 2, 3, 4), solution.findClosestElements(arr, k, x));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        assertEquals(List.of(1, 2, 3, 4), solution.findClosestElements(arr, k, x));
    }
}