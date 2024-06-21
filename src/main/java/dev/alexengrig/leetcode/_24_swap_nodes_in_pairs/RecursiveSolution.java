package dev.alexengrig.leetcode._24_swap_nodes_in_pairs;

class RecursiveSolution implements Task {
    @Override
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode secondNode = head.next;
        head.next = swapPairs(secondNode.next);
        secondNode.next = head;
        return secondNode;
    }
}
