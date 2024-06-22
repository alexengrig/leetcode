package dev.alexengrig.leetcode._25_reverse_nodes_in_k_group;

class RecursiveSolution implements Task {
    @Override
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null, curr = head, next;
        while (curr != tail) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
