package dev.alexengrig.leetcode.premium._161_one_edit_distance;

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
        String s = "ab";
        String t = "acb";
        assertTrue(solution.isOneEditDistance(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "";
        String t = "";
        assertFalse(solution.isOneEditDistance(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "abc";
        String t = "abcd";
        assertTrue(solution.isOneEditDistance(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        String s = "abc";
        String t = "abd";
        assertTrue(solution.isOneEditDistance(s, t));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        String s = "ab";
        String t = "abcd";
        assertFalse(solution.isOneEditDistance(s, t));
    }
}