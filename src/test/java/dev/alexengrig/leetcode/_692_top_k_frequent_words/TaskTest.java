package dev.alexengrig.leetcode._692_top_k_frequent_words;

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
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        assertEquals(List.of("i", "love"), solution.topKFrequent(words, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        assertEquals(List.of("the", "is", "sunny", "day"), solution.topKFrequent(words, k));
    }
}