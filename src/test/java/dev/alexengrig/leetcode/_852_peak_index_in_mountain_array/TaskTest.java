package dev.alexengrig.leetcode._852_peak_index_in_mountain_array;

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
        int[] arr = {0, 1, 0};
        assertEquals(1, solution.peakIndexInMountainArray(arr));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] arr = {0, 2, 1, 0};
        assertEquals(1, solution.peakIndexInMountainArray(arr));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] arr = {0, 10, 5, 2};
        assertEquals(1, solution.peakIndexInMountainArray(arr));
    }
}