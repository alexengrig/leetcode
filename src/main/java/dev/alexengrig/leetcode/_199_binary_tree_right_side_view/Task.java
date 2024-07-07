package dev.alexengrig.leetcode._199_binary_tree_right_side_view;

import java.util.List;

interface Task {
    List<Integer> rightSideView(TreeNode root);

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
