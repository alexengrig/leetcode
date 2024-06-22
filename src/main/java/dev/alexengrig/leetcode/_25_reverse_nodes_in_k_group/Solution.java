package dev.alexengrig.leetcode._25_reverse_nodes_in_k_group;

class Solution implements Task {
    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(), prev = result, begin = head, end;
        int i;
        while (begin != null) {
            end = begin;
            for (i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (i != k) {
                prev.next = begin;
                break;
            }
            prev.next = reverse(begin, end);
            prev = begin;
            begin = end;
        }
        return result.next;
    }

    ListNode reverse(ListNode begin, ListNode end) {
        ListNode prev = null, curr = begin, next;
        while (curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
