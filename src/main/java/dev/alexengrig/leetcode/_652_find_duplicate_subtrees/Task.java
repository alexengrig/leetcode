package dev.alexengrig.leetcode._652_find_duplicate_subtrees;

import java.util.List;

interface Task {
    List<TreeNode> findDuplicateSubtrees(TreeNode root);

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
