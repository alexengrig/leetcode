package dev.alexengrig.leetcode._100_same_tree;

import java.util.LinkedList;
import java.util.Queue;

class QueueSolution implements Task {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        TreeNode node1, node2;
        while (!queue.isEmpty()) {
            node1 = queue.remove();
            node2 = queue.remove();
            if (node1.val != node2.val) {
                return false;
            }
            if (node1.left == null ^ node2.left == null) {
                return false;
            }
            if (node1.right == null ^ node2.right == null) {
                return false;
            }
            if (node1.left != null) {
                queue.add(node1.left);
                queue.add(node2.left);
            }
            if (node1.right != null) {
                queue.add(node1.right);
                queue.add(node2.right);
            }
        }
        return true;
    }
}
