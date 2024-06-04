package dev.alexengrig.leetcode._21_merge_two_sorted_lists;

interface Task {
    ListNode mergeTwoLists(ListNode list1, ListNode list2);

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
