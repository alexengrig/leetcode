package dev.alexengrig.leetcode.solutions.addtwonumbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    static Solution solution = new Solution();

    static int[] toArray(ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void test1() {
        ListNode result = solution.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result));
    }

    @Test
    void test2() {
        ListNode result = solution.addTwoNumbers(new ListNode(0), new ListNode(0));
        assertArrayEquals(new int[]{0}, toArray(result));
    }

    @Test
    void test3() {
        ListNode result = solution.addTwoNumbers(
                new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
        );
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(result));
    }

    @Test
    void test4() {
        ListNode result = solution.addTwoNumbers(
                new ListNode(3, new ListNode(7)),
                new ListNode(9, new ListNode(2))
        );
        assertArrayEquals(new int[]{2, 0, 1}, toArray(result));
    }
}