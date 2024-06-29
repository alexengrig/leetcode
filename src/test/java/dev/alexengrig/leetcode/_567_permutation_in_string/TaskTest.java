package dev.alexengrig.leetcode._567_permutation_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new AlphabetSolution()),
                Arguments.of(new MapSolution()),
                Arguments.of(new MapWithEqualsSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(solution.checkInclusion(s1, s2));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse(solution.checkInclusion(s1, s2));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s1 = "babc";
        String s2 = "aabbca";
        assertTrue(solution.checkInclusion(s1, s2));
    }
}