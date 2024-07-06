package dev.alexengrig.leetcode._110_balanced_binary_tree;

class NLogNSolution implements Task {
    @Override
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1
               && isBalanced(root.left)
               && isBalanced(root.right);
    }

    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
