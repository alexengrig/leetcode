package dev.alexengrig.leetcode.premium._271_encode_and_decode_strings;

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
        List<String> strs = List.of("neet", "code", "love", "you");
        String encode = solution.encode(strs);
        List<String> actual = solution.decode(encode);
        assertEquals(strs, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        List<String> strs = List.of("we", "say", ":", "yes");
        String encode = solution.encode(strs);
        List<String> actual = solution.decode(encode);
        assertEquals(strs, actual);
    }
}
