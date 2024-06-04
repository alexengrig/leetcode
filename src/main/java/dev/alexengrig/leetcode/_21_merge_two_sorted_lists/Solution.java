package dev.alexengrig.leetcode._21_merge_two_sorted_lists;

class Solution implements Task {
    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2);
    }

    ListNode merge(ListNode left, ListNode right) {
        if (left == null || right == null) {
            return left != null ? left : right;
        } else if (left.val <= right.val) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }
}
