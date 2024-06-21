package dev.alexengrig.leetcode._24_swap_nodes_in_pairs;

class Solution implements Task {
    @Override
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode();
        ListNode prev = result, first = head, second = first.next, tmp;
        do {
            // swap
            tmp = second.next;
            second.next = first;
            first.next = tmp;
            // prepare next iteration
            prev.next = second;
            prev = first;
            first = tmp;
        } while (first != null && (second = first.next) != null);
        return result.next;
    }
}
