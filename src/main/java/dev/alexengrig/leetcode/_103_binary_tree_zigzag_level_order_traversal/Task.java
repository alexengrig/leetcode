package dev.alexengrig.leetcode._103_binary_tree_zigzag_level_order_traversal;

import java.util.List;

interface Task {
    List<List<Integer>> zigzagLevelOrder(TreeNode root);

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
