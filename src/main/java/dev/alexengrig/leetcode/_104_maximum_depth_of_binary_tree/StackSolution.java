package dev.alexengrig.leetcode._104_maximum_depth_of_binary_tree;

import java.util.Deque;
import java.util.LinkedList;

public class StackSolution implements Task {
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 1, depth = 1;
        TreeNode node = root;
        Deque<TreeNodeWithDepth> stack = new LinkedList<>();
        TreeNodeWithDepth item;
        do {
            if (node.left != null && node.right != null) {
                depth++;
                stack.push(new TreeNodeWithDepth(node.right, depth));
                node = node.left;
            } else if (node.left != null) {
                depth++;
                node = node.left;
            } else if (node.right != null) {
                depth++;
                node = node.right;
            } else {
                if (max < depth) {
                    max = depth;
                }
                if (stack.isEmpty()) {
                    node = null;
                } else {
                    item = stack.pop();
                    depth = item.depth;
                    node = item.node;
                }
            }
        } while (node != null);
        return max;
    }

    static class TreeNodeWithDepth {
        TreeNode node;
        int depth;

        TreeNodeWithDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
