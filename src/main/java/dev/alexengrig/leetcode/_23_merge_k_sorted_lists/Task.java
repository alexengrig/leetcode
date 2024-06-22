package dev.alexengrig.leetcode._23_merge_k_sorted_lists;

interface Task {
    ListNode mergeKLists(ListNode[] lists);

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
