package dev.alexengrig.leetcode._2_add_two_numbers;

import dev.alexengrig.leetcode._2_add_two_numbers.Task.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new RecursiveSolution()),
                Arguments.of(new IterativeSolution())
        );
    }

    static int[] toArray(ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        ListNode result = solution.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result));
    }


    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        ListNode result = solution.addTwoNumbers(new ListNode(0), new ListNode(0));
        assertArrayEquals(new int[]{0}, toArray(result));
    }


    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        ListNode result = solution.addTwoNumbers(
                new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
        );
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(result));
    }


    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        ListNode result = solution.addTwoNumbers(
                new ListNode(3, new ListNode(7)),
                new ListNode(9, new ListNode(2))
        );
        assertArrayEquals(new int[]{2, 0, 1}, toArray(result));
    }
}