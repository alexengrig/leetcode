package dev.alexengrig.leetcode._680_valid_palindrome2;

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
        String s = "aba";
        assertTrue(solution.validPalindrome(s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "abca";
        assertTrue(solution.validPalindrome(s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "abc";
        assertFalse(solution.validPalindrome(s));
    }
}