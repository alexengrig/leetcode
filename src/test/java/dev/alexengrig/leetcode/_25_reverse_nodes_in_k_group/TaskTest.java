package dev.alexengrig.leetcode._25_reverse_nodes_in_k_group;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution()),
                Arguments.of(new RecursiveSolution())
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
        int k = 2;
        assertListNodeEquals(createList(2, 1, 4, 3, 5), solution.reverseKGroup(head, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.ListNode head = createList(1, 2, 3, 4, 5);
        int k = 3;
        assertListNodeEquals(createList(3, 2, 1, 4, 5), solution.reverseKGroup(head, k));
    }
}