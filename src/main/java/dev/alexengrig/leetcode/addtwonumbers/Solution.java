package dev.alexengrig.leetcode.addtwonumbers;

import java.util.ArrayList;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        return new ListNode(sum % 10, addTwoNumbersRecursive(l1.next, l2.next, sum / 10));
    }

    public ListNode addTwoNumbersRecursive(ListNode left, ListNode right, int tens) {
        if (left != null && right != null) {
            int sum = left.val + right.val + tens;
            return new ListNode(sum % 10, addTwoNumbersRecursive(left.next, right.next, sum / 10));
        } else if (left != null) {
            return addTwoNumbersRecursive(left, tens);
        } else if (right != null) {
            return addTwoNumbersRecursive(right, tens);
        } else if (tens != 0) {
            return new ListNode(tens);
        } else {
            return null;
        }
    }

    public ListNode addTwoNumbersRecursive(ListNode node, int tens) {
        if (node != null) {
            int sum = node.val + tens;
            return new ListNode(sum % 10, addTwoNumbersRecursive(node.next, sum / 10));
        } else if (tens != 0) {
            return new ListNode(tens);
        } else {
            return null;
        }
    }

    public ListNode addTwoNumbersList(ListNode l1, ListNode l2) {
        ArrayList<Integer> values = new ArrayList<>();
        int sum, units, tens = 0;
        do {
            sum = l1.val + l2.val + tens;
            units = sum % 10;
            values.add(units);
            tens = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        } while (l1 != null && l2 != null);
        while (l1 != null) {
            sum = l1.val + tens;
            units = sum % 10;
            values.add(units);
            tens = sum / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + tens;
            units = sum % 10;
            values.add(units);
            tens = sum / 10;
            l2 = l2.next;
        }
        if (tens != 0) {
            values.add(tens);
        }
        ListNode node = null;
        for (int i = values.size() - 1; i >= 0; i--) {
            node = new ListNode(values.get(i), node);
        }
        return node;
    }
}

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



