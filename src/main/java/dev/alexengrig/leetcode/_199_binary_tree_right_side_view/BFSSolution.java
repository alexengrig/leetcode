package dev.alexengrig.leetcode._199_binary_tree_right_side_view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFSSolution implements Task {
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node;
        while (!queue.isEmpty()) {
            for (int i = 0, n = queue.size(); i < n; i++) {
                node = queue.remove();
                if (i == n - 1) {
                    values.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return values;
    }
}
