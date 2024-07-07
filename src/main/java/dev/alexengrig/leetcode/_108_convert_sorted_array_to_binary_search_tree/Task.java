package dev.alexengrig.leetcode._108_convert_sorted_array_to_binary_search_tree;

interface Task {
    TreeNode sortedArrayToBST(int[] nums);

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
