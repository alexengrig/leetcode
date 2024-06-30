package dev.alexengrig.leetcode._438_find_all_anagrams_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new AlphabetSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        String s = "cbaebabacd";
        String p = "abc";
        assertEquals(List.of(0, 6), solution.findAnagrams(s, p));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "abab";
        String p = "ab";
        assertEquals(List.of(0, 1, 2), solution.findAnagrams(s, p));
    }
}