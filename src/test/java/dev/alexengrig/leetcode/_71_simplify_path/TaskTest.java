package dev.alexengrig.leetcode._71_simplify_path;

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
        String path = "/home/";
        assertEquals("/home", solution.simplifyPath(path));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String path = "/home//foo/";
        assertEquals("/home/foo", solution.simplifyPath(path));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String path = "/home/user/Documents/../Pictures";
        assertEquals("/home/user/Pictures", solution.simplifyPath(path));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        String path = "/../";
        assertEquals("/", solution.simplifyPath(path));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        String path = "/.../a/../b/c/../d/./";
        assertEquals("/.../b/d", solution.simplifyPath(path));
    }
}