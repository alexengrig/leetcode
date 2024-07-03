package dev.alexengrig.leetcode._1436_destination_city;

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
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        assertEquals("Sao Paulo", solution.destCity(paths));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        List<List<String>> paths = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A")
        );
        assertEquals("A", solution.destCity(paths));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        List<List<String>> paths = List.of(
                List.of("A", "Z")
        );
        assertEquals("Z", solution.destCity(paths));
    }
}