package dev.alexengrig.leetcode._2_add_two_numbers;

interface Task {
    ListNode addTwoNumbers(ListNode l1, ListNode l2);

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
