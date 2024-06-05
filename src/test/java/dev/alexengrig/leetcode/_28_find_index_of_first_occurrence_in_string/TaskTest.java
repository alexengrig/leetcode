package dev.alexengrig.leetcode._28_find_index_of_first_occurrence_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new NaiveSolution()),
                Arguments.of(new KMPSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        String haystack = "sadbutsad";
        String needle = "sad";
        assertEquals(0, solution.strStr(haystack, needle));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String haystack = "leetcode";
        String needle = "leeto";
        assertEquals(-1, solution.strStr(haystack, needle));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String haystack = "a";
        String needle = "a";
        assertEquals(0, solution.strStr(haystack, needle));
    }
}