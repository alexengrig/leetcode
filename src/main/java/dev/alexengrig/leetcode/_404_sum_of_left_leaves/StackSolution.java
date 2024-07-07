package dev.alexengrig.leetcode._404_sum_of_left_leaves;

import java.util.Deque;
import java.util.LinkedList;

class StackSolution implements Task {
    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        boolean isLeft = false;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        do {
            if (node.left != null && node.right != null) {
                stack.push(node.right);
                node = node.left;
                isLeft = true;
            } else if (node.left != null) {
                node = node.left;
                isLeft = true;
            } else if (node.right != null) {
                node = node.right;
                isLeft = false;
            } else {
                if (isLeft) {
                    sum += node.val;
                }
                if (stack.isEmpty()) {
                    node = null;
                } else {
                    node = stack.pop();
                }
                isLeft = false;
            }
        } while (node != null);
        return sum;
    }
}
