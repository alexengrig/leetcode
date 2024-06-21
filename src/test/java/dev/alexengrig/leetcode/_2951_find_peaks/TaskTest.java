package dev.alexengrig.leetcode._2951_find_peaks;

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
        int[] mountain = {2, 4, 4};
        assertEquals(List.of(), solution.findPeaks(mountain));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] mountain = {1, 4, 3, 8, 5};
        assertEquals(List.of(1, 3), solution.findPeaks(mountain));
    }
}