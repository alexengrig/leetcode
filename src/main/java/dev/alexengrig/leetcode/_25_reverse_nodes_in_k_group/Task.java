package dev.alexengrig.leetcode._25_reverse_nodes_in_k_group;

interface Task {
    ListNode reverseKGroup(ListNode head, int k);

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
