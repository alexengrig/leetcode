package dev.alexengrig.leetcode._24_swap_nodes_in_pairs;

interface Task {
    ListNode swapPairs(ListNode head);

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
