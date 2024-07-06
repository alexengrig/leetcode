package dev.alexengrig.leetcode._110_balanced_binary_tree;

class LineSolution implements Task {
    @Override
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getHeight(node.left);
        if (left == -1) {
            return -1;
        }
        int right = getHeight(node.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
