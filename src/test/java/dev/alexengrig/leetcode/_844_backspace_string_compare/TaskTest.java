package dev.alexengrig.leetcode._844_backspace_string_compare;

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
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(solution.backspaceCompare(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "ab##";
        String t = "c#d#";
        assertTrue(solution.backspaceCompare(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "a#c";
        String t = "b";
        assertFalse(solution.backspaceCompare(s, t));
    }
}