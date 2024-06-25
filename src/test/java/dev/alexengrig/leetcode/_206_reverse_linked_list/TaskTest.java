package dev.alexengrig.leetcode._206_reverse_linked_list;

import org.junit.jupiter.api.Assertions;
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

    static void assertListNodeEquals(Task.ListNode expected, Task.ListNode actual) {
        if (expected == null ^ actual == null) {
            Assertions.fail();
        }
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        if (expected == null ^ actual == null) {
            Assertions.fail();
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        Task.ListNode head = createList(1, 2, 3, 4, 5);
        assertListNodeEquals(createList(5, 4, 3, 2, 1), solution.reverseList(head));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.ListNode head = createList(1, 2);
        assertListNodeEquals(createList(2, 1), solution.reverseList(head));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        Task.ListNode head = createList();
        assertListNodeEquals(createList(), solution.reverseList(head));
    }
}