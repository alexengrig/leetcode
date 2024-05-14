package dev.alexengrig.leetcode._2_add_two_numbers;

import java.util.ArrayList;

class IterativeSolution implements Task {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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




