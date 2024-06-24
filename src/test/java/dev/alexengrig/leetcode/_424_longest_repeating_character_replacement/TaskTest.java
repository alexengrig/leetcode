package dev.alexengrig.leetcode._424_longest_repeating_character_replacement;

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
        String s = "ABAB";
        int k = 2;
        assertEquals(4, solution.characterReplacement(s, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "AABABBA";
        int k = 1;
        assertEquals(4, solution.characterReplacement(s, k));
    }
}