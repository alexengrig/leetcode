package dev.alexengrig.leetcode._49_group_anagrams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
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
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(List.of(
                List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")
        ), solution.groupAnagrams(strs));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String[] strs = {""};
        assertEquals(List.of(
                List.of("")
        ), solution.groupAnagrams(strs));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String[] strs = {"a"};
        assertEquals(List.of(
                List.of("a")
        ), solution.groupAnagrams(strs));
    }
}