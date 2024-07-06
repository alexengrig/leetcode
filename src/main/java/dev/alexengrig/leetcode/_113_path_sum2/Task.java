package dev.alexengrig.leetcode._113_path_sum2;

import java.util.List;

interface Task {
    List<List<Integer>> pathSum(TreeNode root, int targetSum);

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
