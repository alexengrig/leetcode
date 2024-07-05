package dev.alexengrig.leetcode._234_palindrome_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    static Task.ListNode createList(int... values) {
        if (values.length == 0) {
            return null;
        }
        Task.ListNode node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            node = new Task.ListNode(values[i], node);
        }
        return node;
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        Task.ListNode head = createList(1, 2, 2, 1);
        assertTrue(solution.isPalindrome(head));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.ListNode head = createList(1, 2);
        assertFalse(solution.isPalindrome(head));
    }
}