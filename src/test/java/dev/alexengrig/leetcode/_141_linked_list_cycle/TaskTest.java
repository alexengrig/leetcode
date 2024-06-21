package dev.alexengrig.leetcode._141_linked_list_cycle;

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

    static Task.ListNode createList(int cycleIndex, int... values) {
        if (values.length == 0) {
            return null;
        }
        Task.ListNode lastNode = new Task.ListNode(values[values.length - 1]);
        Task.ListNode node = lastNode;
        Task.ListNode cycleNode = null;
        for (int i = values.length - 2; i >= 0; i--) {
            node = new Task.ListNode(values[i], node);
            if (cycleIndex == i) {
                cycleNode = node;
            }
        }
        lastNode.next = cycleNode;
        return node;
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        Task.ListNode head = createList(1, 3, 2, 0, -4);
        assertTrue(solution.hasCycle(head));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.ListNode head = createList(0, 1, 2);
        assertTrue(solution.hasCycle(head));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        Task.ListNode head = createList(-1, 1);
        assertFalse(solution.hasCycle(head));
    }
}