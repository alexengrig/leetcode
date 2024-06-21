package dev.alexengrig.leetcode._19_remove_nth_node_from_end_of_list;

interface Task {
    ListNode removeNthFromEnd(ListNode head, int n);

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
