package dev.alexengrig.leetcode._141_linked_list_cycle;

interface Task {
    boolean hasCycle(ListNode head);

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode node) {
            val = x;
            next = node;
        }
    }
}
