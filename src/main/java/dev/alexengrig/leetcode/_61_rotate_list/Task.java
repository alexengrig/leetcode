package dev.alexengrig.leetcode._61_rotate_list;

interface Task {
    ListNode rotateRight(ListNode head, int k);

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
