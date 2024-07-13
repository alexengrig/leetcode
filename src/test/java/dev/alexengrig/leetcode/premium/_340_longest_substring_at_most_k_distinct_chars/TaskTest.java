package dev.alexengrig.leetcode.premium._340_longest_substring_at_most_k_distinct_chars;

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
        String s = "eceba";
        int k = 2;
        assertEquals(3, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "aa";
        int k = 1;
        assertEquals(2, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "aabbbccc";
        int k = 1;
        assertEquals(3, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        String s = "aaaabbbcccddddd";
        int k = 2;
        assertEquals(8, solution.lengthOfLongestSubstringKDistinct(s, k));
    }
}