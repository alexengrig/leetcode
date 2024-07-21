package dev.alexengrig.leetcode._222_count_complete_tree_nodes;

class LogN2Solution implements Task {
    @Override
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = 0;
        TreeNode left = root;
        while (left != null) {
            leftDepth++;
            left = left.left;
        }
        int rightDepth = 0;
        TreeNode right = root;
        while (right != null) {
            rightDepth++;
            right = right.right;
        }
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
