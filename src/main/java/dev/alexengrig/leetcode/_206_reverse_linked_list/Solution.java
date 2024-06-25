package dev.alexengrig.leetcode._206_reverse_linked_list;

class Solution implements Task {
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, node = head, next;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
