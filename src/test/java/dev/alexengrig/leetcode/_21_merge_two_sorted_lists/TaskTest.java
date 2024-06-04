package dev.alexengrig.leetcode._21_merge_two_sorted_lists;

import dev.alexengrig.leetcode._21_merge_two_sorted_lists.Task.ListNode;
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

    static ListNode createList(int... values) {
        if (values.length == 0) {
            return null;
        }
        ListNode node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            node = new ListNode(values[i], node);
        }
        return node;
    }

    static void assertListNodeEquals(ListNode expected, ListNode actual) {
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
        ListNode left = createList(1, 2, 4);
        ListNode right = createList(1, 3, 4);
        assertListNodeEquals(createList(1, 1, 2, 3, 4, 4), solution.mergeTwoLists(left, right));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        ListNode left = createList();
        ListNode right = createList();
        assertListNodeEquals(createList(), solution.mergeTwoLists(left, right));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        ListNode left = createList();
        ListNode right = createList(0);
        assertListNodeEquals(createList(0), solution.mergeTwoLists(left, right));
    }
}