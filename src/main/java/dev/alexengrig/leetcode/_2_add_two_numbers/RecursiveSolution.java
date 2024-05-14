package dev.alexengrig.leetcode._2_add_two_numbers;

class RecursiveSolution implements Task {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        return new ListNode(sum % 10, addTwoNumbersRecursively(l1.next, l2.next, sum / 10));
    }

    public ListNode addTwoNumbersRecursively(ListNode left, ListNode right, int tens) {
        if (left != null && right != null) {
            int sum = left.val + right.val + tens;
            return new ListNode(sum % 10, addTwoNumbersRecursively(left.next, right.next, sum / 10));
        } else if (left != null) {
            return addTwoNumbersRecursively(left, tens);
        } else if (right != null) {
            return addTwoNumbersRecursively(right, tens);
        } else if (tens != 0) {
            return new ListNode(tens);
        } else {
            return null;
        }
    }

    public ListNode addTwoNumbersRecursively(ListNode node, int tens) {
        if (node != null) {
            int sum = node.val + tens;
            return new ListNode(sum % 10, addTwoNumbersRecursively(node.next, sum / 10));
        } else if (tens != 0) {
            return new ListNode(tens);
        } else {
            return null;
        }
    }
}




