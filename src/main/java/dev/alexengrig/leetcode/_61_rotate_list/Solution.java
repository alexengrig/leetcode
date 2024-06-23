package dev.alexengrig.leetcode._61_rotate_list;

class Solution implements Task {
    @Override
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 2;
        ListNode tail = head.next;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }
        int shift = k % size;
        if (shift == 0) {
            return head;
        }
        int indexOfPrev = (size - shift) - 1;
        ListNode prev = head;
        for (int i = 0; i < indexOfPrev; i++) {
            prev = prev.next;
        }
        ListNode newHead = prev.next;
        prev.next = null;
        tail.next = head;
        return newHead;
    }
}
