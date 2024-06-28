package dev.alexengrig.leetcode._228_summary_ranges;

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
        int[] nums = {0, 1, 2, 4, 5, 7};
        assertEquals(List.of("0->2", "4->5", "7"), solution.summaryRanges(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        assertEquals(List.of("0", "2->4", "6", "8->9"), solution.summaryRanges(nums));
    }
}