package dev.alexengrig.leetcode._235_lca_of_bst;

interface Task {
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);

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
