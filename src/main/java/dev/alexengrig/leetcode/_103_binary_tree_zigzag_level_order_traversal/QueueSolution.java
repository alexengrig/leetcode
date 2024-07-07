package dev.alexengrig.leetcode._103_binary_tree_zigzag_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class QueueSolution implements Task {
    @Override
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean left2Right = true;
        TreeNode node;
        int size;
        while (!queue.isEmpty()) {
            size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for (; size > 0; size--) {
                node = queue.remove();
                if (left2Right) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            levels.add(level);
            left2Right = !left2Right;
        }
        return levels;
    }
}
