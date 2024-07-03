package dev.alexengrig.leetcode._76_minimum_window_substring;

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
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", solution.minWindow(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "a";
        String t = "a";
        assertEquals("a", solution.minWindow(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "a";
        String t = "aa";
        assertEquals("", solution.minWindow(s, t));
    }
}