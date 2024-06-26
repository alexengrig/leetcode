package dev.alexengrig.leetcode._14_longest_common_prefix;

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
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }
}