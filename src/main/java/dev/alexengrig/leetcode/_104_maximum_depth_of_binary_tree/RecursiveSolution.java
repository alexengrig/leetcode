package dev.alexengrig.leetcode._104_maximum_depth_of_binary_tree;

class RecursiveSolution implements Task {
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
