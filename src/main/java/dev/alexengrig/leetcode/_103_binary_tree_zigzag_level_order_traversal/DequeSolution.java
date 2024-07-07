package dev.alexengrig.leetcode._103_binary_tree_zigzag_level_order_traversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class DequeSolution implements Task {
    @Override
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> levels = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        boolean left2Right = true;
        TreeNode node;
        int size;
        while (!deque.isEmpty()) {
            size = deque.size();
            List<Integer> level = new ArrayList<>(size);
            for (; size > 0; size--) {
                if (left2Right) {
                    node = deque.removeFirst();
                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                } else {
                    node = deque.removeLast();
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }
                }
                level.add(node.val);
            }
            levels.add(level);
            left2Right = !left2Right;
        }
        return levels;
    }
}
